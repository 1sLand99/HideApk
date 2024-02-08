package com.hepta.fridaload;

import android.content.Context;

public class LoadEntry {

//    static {
//
//        System.loadLibrary("nativetext");
//    }

    public static void Entry(Context context , String source){
        LoadSo(context,source);
        
    }

    private static void LoadSo(Context context, String source) {

        String abi= "arm64-v8a";
        if(!android.os.Process.is64Bit()){
            abi = "armeabi-v7a";
        }
        String str = source+"!/lib/"+abi+"/libfrida-gadget.so";
        System.load(str);
    }

    public  static native void text(String str);

}
