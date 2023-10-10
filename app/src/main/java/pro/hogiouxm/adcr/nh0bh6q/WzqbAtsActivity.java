package pro.hogiouxm.adcr.cg0mhzg;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import name.ktzmgatzx.fcn.y14s9rbsf2orv0.AwJlo;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.BdYxpl;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Ceyke;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Cpnby;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.CqDgdk;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Drgq;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Eef;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.EzEx;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Gek;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Hlxt;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Jeczh;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.JmRo;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.LlUwc;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Lmqc;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.LuTaq;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Naby;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Ntro;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Nuq;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.OpByj;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Puuaq;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.TfNmtpz;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Vzi;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Yse;

import org.json.JSONObject;

/* loaded from: /Users/dev/Desktop/Qun/Study_APK/wo_kao_classes.dex */
public class WzqbAtsActivity extends Activity {
    public WebView webView;


    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        // todo C++ 函数
        bmtIdzi();
    }

    /**
     * vgBguag
     */
    native void bmtIdzi();


    /**
     * vgBguagz
     *
     * @param str
     * @param map
     */
    native void vgBguag(String str, Map<String, Object> map);


    /**
     * Js 调这个函数，这个函数里有JNI 函数。
     *
     * @param str  map的key
     * @param str2 json 字符串
     */
    @JavascriptInterface
    public void adcra(String str, String str2) {
        // hashMap11 有用
        Map<String, Object> hashMap11 = new HashMap<>();
        try {
            // todo jSONObject
            JSONObject jSONObject = new JSONObject(str2);
            // 把json放到map中，然后传给C++
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                // todo hashMap11  <K,V>
                hashMap11.put(next, jSONObject.get(next));
            }
            // C++
            vgBguag(str, hashMap11);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @JavascriptInterface
    public void adcro(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /***
     * 有webview操作
     */
    @Override // android.app.Activity
    public void onBackPressed() {
        // ------------------------------------------------------------------------------------------------start.
        // webview
        if (!this.webView.canGoBack()) {
            return;
        }

        // todo webview
        this.webView.goBack();
        // ------------------------------------------------------------------------------------------------end.
    }
}