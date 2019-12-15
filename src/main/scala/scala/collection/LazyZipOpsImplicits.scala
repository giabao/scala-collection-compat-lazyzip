package scala.collection

import scala.language.higherKinds

object LazyZipOpsImplicits {
  implicit class Iterable2Lazy[A, C[T] <: Iterable[T]](val it: C[A]) extends AnyVal {
    /** Analogous to `zip` except that the elements in each collection are not consumed until a strict operation is
     * invoked on the returned `LazyZip2` decorator.
     *
     * Calls to `lazyZip` can be chained to support higher arities (up to 4) without incurring the expense of
     * constructing and deconstructing intermediary tuples.
     *
     * {{{
     *    val xs = List(1, 2, 3)
     *    val res = (xs lazyZip xs lazyZip xs lazyZip xs).map((a, b, c, d) => a + b + c + d)
     *    // res == List(4, 8, 12)
     * }}}
     *
     * @param that the iterable providing the second element of each eventual pair
     * @tparam B   the type of the second element in each eventual pair
     * @return a decorator `LazyZip2` that allows strict operations to be performed on the lazily evaluated pairs
     *         or chained calls to `lazyZip`. Implicit conversion to `Iterable[(A, B)]` is also supported.
     */
    def lazyZip[B](that: Iterable[B]): LazyZip2[A, B, C[A]] = new LazyZip2(it, it, that)
  }
}
