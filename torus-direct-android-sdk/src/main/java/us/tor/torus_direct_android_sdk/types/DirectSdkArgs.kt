package us.tor.torus_direct_android_sdk.types

import org.torusresearch.fetchnodedetails.types.EthereumNetwork

class DirectSdkArgs(
    val googleClientId: String?,
    val facebookClientId: String?,
    val redditClientId: String?,
    val twitchClientId: String?,
    val discordClientId: String?,
    val baseUrl: String,
    val network: EthereumNetwork?,
    val proxyContractAddress: String?
)