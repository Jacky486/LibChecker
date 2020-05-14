package com.absinthe.libchecker.constant

import com.absinthe.libchecker.R

object NativeLibMap {
    val MAP: HashMap<String, LibChip> = hashMapOf(
        Pair("libflutter.so", LibChip(R.drawable.ic_lib_flutter, "Flutter")),
        Pair("libapp.so", LibChip(R.drawable.ic_lib_flutter, "Flutter")),
        Pair("libBugly.so", LibChip(R.drawable.ic_lib_bugly, "Bugly")),
        Pair("libBugly-rqd.so", LibChip(R.drawable.ic_lib_bugly, "Bugly")),
        Pair("libtpnsSecurity.so", LibChip(R.drawable.ic_lib_tencent, "信鸽推送")),
        Pair("libxguardian.so", LibChip(R.drawable.ic_lib_tencent, "信鸽推送")),
        Pair("libhippybridge.so", LibChip(R.drawable.ic_lib_tencent, "Hippy")),
        Pair("libflexbox.so", LibChip(R.drawable.ic_lib_tencent, "Hippy")),
        Pair("libmmkv.so", LibChip(R.drawable.ic_lib_tencent, "MMKV")),
        Pair("libBeacon.so", LibChip(R.drawable.ic_lib_tencent, "腾讯流量联盟")),
        Pair("libliteavsdk.so", LibChip(R.drawable.ic_lib_tencent_cloud, "腾讯云直播 SDK")),
        Pair("libsaturn.so", LibChip(R.drawable.ic_lib_tencent_cloud, "腾讯云直播 SDK")),
        Pair("libijkplayer.so", LibChip(R.drawable.ic_lib_bilibili, "IJKPlayer")),
        Pair("libijksdl.so", LibChip(R.drawable.ic_lib_bilibili, "IJKPlayer")),
        Pair("libijkffmpeg.so", LibChip(R.drawable.ic_lib_bilibili, "IJKPlayer")),
        Pair("libreactnativejni.so", LibChip(R.drawable.ic_lib_react, "React Native")),
        Pair("libfb.so", LibChip(R.drawable.ic_lib_react, "React Native")),
        Pair("libjsc.so", LibChip(R.drawable.ic_lib_react, "React Native")),
        Pair("libjiagu.so", LibChip(R.drawable.ic_lib_360, "360 加固")),
        Pair("libc++_shared.so", LibChip(R.drawable.ic_lib_cpp, "C++ 共享库")),
        Pair("libstlport_shared.so", LibChip(R.drawable.ic_lib_cpp, "C++ STL")),
        Pair("libwind.so", LibChip(R.drawable.ic_lib_weibo, "微博 SDK")),
        Pair("libutility.so", LibChip(R.drawable.ic_lib_weibo, "微博 SDK")),
        Pair("libweibosdkcore.so", LibChip(R.drawable.ic_lib_weibo, "微博 SDK")),
        Pair("libmsc.so", LibChip(R.drawable.ic_lib_xunfei, "讯飞 SDK")),
        Pair("libluajava.so", LibChip(R.drawable.ic_lib_lua, "AndroLua")),
        Pair("libRSSupport.so", LibChip(R.drawable.ic_android_outline, "RenderScript")),
        Pair("librsjni.so", LibChip(R.drawable.ic_android_outline, "RenderScript")),
        Pair("librsjni_androidx.so", LibChip(R.drawable.ic_android_outline, "RenderScript")),
        Pair("libweexcore.so", LibChip(R.drawable.ic_lib_alibaba, "Weex")),
        Pair("libWeexEagle.so", LibChip(R.drawable.ic_lib_alibaba, "Weex")),
        Pair("libweexjst.so", LibChip(R.drawable.ic_lib_alibaba, "Weex")),
        Pair("libweexjss.so", LibChip(R.drawable.ic_lib_alibaba, "Weex")),
        Pair("libweexjsb.so", LibChip(R.drawable.ic_lib_alibaba, "Weex")),
        Pair("libweexjssr.so", LibChip(R.drawable.ic_lib_alibaba, "Weex")),
        Pair("libWTF.so", LibChip(R.drawable.ic_lib_alibaba, "Weex")),
        Pair("libandfix.so", LibChip(R.drawable.ic_lib_alibaba, "AndFix")),
        Pair("libcrashsdk.so", LibChip(R.drawable.ic_lib_alibaba, "岳鹰 SDK")),
        Pair("libtencentloc.so", LibChip(R.drawable.ic_lib_tencent_map, "腾讯地图 SDK")),
        Pair("libtxmapengine.so", LibChip(R.drawable.ic_lib_tencent_map, "腾讯地图 SDK")),
        Pair("libyuv.so", LibChip(R.drawable.ic_lib_google, "libYUV")),
        Pair("libYUV.so", LibChip(R.drawable.ic_lib_google, "libYUV")),
        Pair("libglog.so", LibChip(R.drawable.ic_lib_google, "glog")),
        Pair("libunity.so", LibChip(R.drawable.ic_lib_unity, "Unity")),
        Pair("libmain.so", LibChip(R.drawable.ic_lib_unity, "Unity")),
        Pair("libmono.so", LibChip(R.drawable.ic_lib_unity, "Unity")),
        Pair("libyoga.so", LibChip(R.drawable.ic_lib_facebook, "Yoga")),
        Pair("librealm-jni.so", LibChip(R.drawable.ic_lib_realm, "realm")),
        Pair("libcrashlytics.so", LibChip(R.drawable.ic_lib_firebase, "Crashlytics")),
        Pair("libopencv_java3.so", LibChip(R.drawable.ic_lib_opencv, "OpenCV")),
        Pair("libpl_droidsonroids_gif.so", LibChip(R.drawable.ic_lib_gif, "android-gif-drawable")),
        Pair("libCtaApiLib.so", LibChip(R.drawable.ic_lib_jverification, "极光认证 SDK")),
        Pair("libsqlcipher.so", LibChip(R.drawable.ic_lib_sql, "SQLCipher")),
        Pair("libstlport_shared.so", LibChip(R.drawable.ic_lib_sql, "SQLCipher")),
        Pair("libsgsecuritybody.so", LibChip(R.drawable.ic_lib_ali_security, "阿里聚安全")),
        Pair("libsgavmp.so", LibChip(R.drawable.ic_lib_ali_security, "阿里聚安全")),
        Pair("libsgmain.so", LibChip(R.drawable.ic_lib_ali_security, "阿里聚安全")),
        Pair("libimagepipeline.so", LibChip(R.drawable.ic_lib_facebook, "Fresco")),
        Pair("libstatic-webp.so", LibChip(R.drawable.ic_lib_facebook, "Fresco")),
        Pair("libbitmaps.so", LibChip(R.drawable.ic_lib_facebook, "Fresco")),
        Pair("libgifimage.so", LibChip(R.drawable.ic_lib_facebook, "Fresco")),
        Pair("libmemchunk.so", LibChip(R.drawable.ic_lib_facebook, "Fresco")),
        Pair("libwebpimage.so", LibChip(R.drawable.ic_lib_facebook, "Fresco")),
        Pair("libwebp.so", LibChip(R.drawable.ic_lib_facebook, "Fresco")),
        Pair("libentryexpro.so", LibChip(R.drawable.ic_lib_unionpay, "银联 SDK")),
        Pair("libsdk_patcher_jni.so", LibChip(R.drawable.ic_lib_xiaomi, "小米更新 SDK")),
        Pair("libmibraindec.so", LibChip(R.drawable.ic_lib_xiaomi, "小爱 SDK")),
        Pair("libmibrainjni.so", LibChip(R.drawable.ic_lib_xiaomi, "小爱 SDK")),
        Pair("libmibrainsdk.so", LibChip(R.drawable.ic_lib_xiaomi, "小爱 SDK")),
        Pair("libmibrainvad2.so", LibChip(R.drawable.ic_lib_xiaomi, "小爱 SDK")),
        Pair("libapssdk.so", LibChip(R.drawable.ic_lib_amap, "高德 SDK")),
        Pair("libBaiduSpeechSDK.so", LibChip(R.drawable.ic_lib_baidu, "DuMix")),
        Pair("libvad.dnn.so", LibChip(R.drawable.ic_lib_baidu, "DuMix")),
        Pair("libbdSpilWakeup.so", LibChip(R.drawable.ic_lib_baidu, "DuMix")),
        Pair("libbdEASRAndroid.so", LibChip(R.drawable.ic_lib_baidu, "DuMix")),
        Pair("libImgRecognition.so", LibChip(R.drawable.ic_lib_baidu, "DuMix"))
        )
}