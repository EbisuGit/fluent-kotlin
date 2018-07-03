fun String.asColor() = Color.parseColor(this)

val View.isVisible get() = visibility == View.VISIBLE
val View.isGone get() = visibility == View.GONE
val View.isInvisible get() = visibility == View.INVISIBLE

fun View.show() { visibility = View.VISIBLE }
fun View.hide() { visibility = View.GONE }
fun View.makeInvisible() { visibility = View.INVISIBLE }

fun Boolean.toVisibility() = if(this) View.VISIBLE else View.GONE

/** Use only when you don't care if exception is thrown and operation doesn't invalidate other functionalities */
fun consumeExceptions(block: ()->Unit) = try {block()} catch(ex: Throwable) {}
fun <T> tryOrDefault(block: ()->T, defaultValue: T): T = try{block()} catch(ex: Throwable) {defaultValue}

fun <T> Any.to() = this as T

fun <T> MutableCollection<T>.overwrite(newCollection: Collection<T>) {
    clear()
    addAll(newCollection)
}

fun TextView.clear() {
    text = ""
}

inline fun <T, reified R> T?.argIfPresent(func: (T) -> R): R? {
    if(this == null) {
        return null
    }
    return func(this)
}

inline fun <T, reified O, reified R> T?.argIfPresent(obj: O, func: O.(T) -> R): R? {
    if(this == null) {
        return null
    }
    return func(obj, this@argIfPresent)
}
