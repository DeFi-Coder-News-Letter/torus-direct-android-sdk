package us.tor.torus_direct_android_sdk.types

class TorusLoginResponse(
    val email: String,
    val name: String,
    val profileImage: String,
    val verifier: String,
    val verifierId: String,
    _publicAddress: String?,
    _privateKey: String?
) : TorusKey(_publicAddress!!, _privateKey!!)