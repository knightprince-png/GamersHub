package com.felix.gamers_hub.navigation

const val ROUT_CONTACT = "contacts"
const val ROUT_HOME = "home"
const val ROUT_ABOUT = "about"
const val ROUT_SPLASH = "splash"
//Auth
const val ROUT_REGISTER = "Register"
const val ROUT_LOGIN = "Login"
const val ROUT_LANDING = "Landing"
const val ROUT_HOMEPAGE = "homepage"
const val ROUT_ASUS = "asus"
const val ROUT_IPHONE = "iphone"
const val ROUT_VIVO = "vivo"
const val ROUT_PIXEL = "pixel"
const val ROUT_LEGION = "legion"
const val ROUT_IPAD = "ipad"
const val ROUT_TAB = "tab"
const val ROUT_BLACK = "black"
const val ROUT_XIAOMI = "xiaomi"
const val ROUT_ONE = "one"
const val ROUT_TABS = "tabs"
const val ROUT_PHONE = "phone"





//Products

const val ROUT_ADD_PRODUCT = "add_product"
const val ROUT_PRODUCT_LIST = "product_list"
const val ROUT_EDIT_PRODUCT = "edit_product/{productId}"

// ✅ Helper function for navigation
fun editProductRoute(productId: Int) = "edit_product/$productId"


