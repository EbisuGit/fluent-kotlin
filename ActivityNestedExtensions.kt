    fun <T : View> @receiver:IdRes Int.view() : T = findViewById<T>(this)
    val @receiver:IdRes Int.view : View get() = findViewById<View>(this)
    fun <T : Drawable> @receiver:DrawableRes Int.drawable(): T = ContextCompat.getDrawable(this@BaseActivity, this@drawable) as T
    fun <T : Animation> @receiver:AnimRes Int.animation(): T = AnimationUtils.loadAnimation(this@BaseActivity, this@animation) as T
    fun <T : Color> @receiver:ColorRes Int.color(): T = ContextCompat.getColor(this@BaseActivity, this@color) as T
    fun <T : Layout> @receiver:LayoutRes Int.inflate() = layoutInflater.inflate(this@inflate, null)
    fun <T : Menu> @receiver:android.support.annotation.MenuRes Int.menu(anchor: View): Menu = PopupMenu(this@BaseActivity, anchor).menu.apply apply@ {menuInflater.inflate(this@menu, this@apply)}
    fun @receiver:StringRes Int.string(): String = getString(this@string)
    fun @receiver:StyleRes Int.style(@StyleableRes attr: Int): TypedArray = obtainStyledAttributes(this@style, intArrayOf(attr)) //TODO: return target value instead of TypedArray
    fun @receiver:StyleRes Int.style(@StyleableRes attrs: List<Int>): TypedArray = obtainStyledAttributes(this@style, attrs.toIntArray())
    fun @receiver:FontRes Int.font(): Typeface = ResourcesCompat.getFont(this@BaseActivity, this@font)?: throw RuntimeException("Font " + resources.getResourceName(this@font) + " not found")
    fun @receiver:BoolRes Int.bool(): Boolean = resources.getBoolean(this@bool)
    fun @receiver:DimenRes Int.dimen(): Float = resources.getDimension(this@dimen)
    fun @receiver:IntegerRes Int.integer(): Int = resources.getInteger(this@integer)
    fun @receiver:ArrayRes Int.integerArray(): IntArray = resources.getIntArray(this@integerArray)
    fun @receiver:ArrayRes Int.typedArray(): TypedArray = resources.obtainTypedArray(this@typedArray)
