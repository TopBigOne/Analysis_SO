package pro.hogiouxm.adcr.lhlsgw0;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.adjust.sdk.Constants;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import name.ktzmgatzx.fcn.y14s9rbsf2orv0.AmKuuo;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.BdYxpl;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Cpnby;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.CqDgdk;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Drgq;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Eef;
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
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Qyrfx;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.TfNmtpz;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Vzi;

/* loaded from: /Users/dev/Desktop/Qun/Study_APK/wo_kao_classes.dex */

/**
 * WebViewClient 配置
 */
public class NcDgPowe extends WebViewClient {
    private Context mContext;
    // uri 内容: str3 给它赋值
    private String  vzLwert;
    private String  mStr;
    private String  mStr2;

//    ------------------------------------------------------------start-----------------------------------------------------
//    ------------------------------------------------------------start-----------------------------------------------------
//    ------------------------------------------------------------start-----------------------------------------------------
//    ------------------------------------------------------------start-----------------------------------------------------
//    ------------------------------------------------------------start-----------------------------------------------------

    /**
     * @param context
     * @param str     webview 调用
     * @param str2    正则匹配
     * @param str3    给 uri 赋值
     */
    public NcDgPowe(Context context, String str, String str2, String str3) {
        this.mContext = context;
        this.mStr = str;
        this.mStr2 = str2;
        this.vzLwert = str3;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!this.mStr.isEmpty()) {
            // webview 调用
            webView.evaluateJavascript(this.mStr, null);

        }
        super.onPageStarted(webView, str, bitmap);

    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String  uri     = webResourceRequest.getUrl().toString();
        Matcher matcher = Pattern.compile(this.mStr2).matcher(uri);

        if (matcher.find()) {
            try {
                // 内部打开webView
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(uri));
                intent.addFlags(268435456);
                this.mContext.startActivity(intent);

            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }

        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    /**
     * 用于在 WebView 中替换或修改加载的网络资源的响应。它允许您拦截和自定义 WebView 加载的资源，例如替换资源内容、修改响应头或执行其他操作。
     * @param webView The {@link android.webkit.WebView} that is requesting the
     *             resource.
     * @param webResourceRequest Object containing the details of the request.
     * @return
     */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        // case 1 : 做限定 // 不含有MIME类型的请求不拦截
        if (!uri.contains(this.vzLwert)) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        String decode = URLDecoder.decode(uri, Constants.ENCODING);
        try {
            // todo Get 请求？
            if (decode.contains("?")) {
                decode = decode.split("\\?")[0];
            }
            // 文件路径
            String replace = decode.replace(this.vzLwert, "");
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(replace);
            // todo 文件
            File file = new File(this.mContext.getFilesDir().getPath() + "/" + replace);
            if (file.exists()) {
                // 请求输入流
                FileInputStream fileInputStream = new FileInputStream(file);
                // case 2:
                return new WebResourceResponse(guessContentTypeFromName, Constants.ENCODING, fileInputStream);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // case 3： 传一个空字节
        return new WebResourceResponse("text/html", Constants.ENCODING, new ByteArrayInputStream("".getBytes()));
    }

//    ------------------------------------------------------------end-----------------------------------------------------
//    ------------------------------------------------------------end-----------------------------------------------------
//    ------------------------------------------------------------end-----------------------------------------------------
//    ------------------------------------------------------------end-----------------------------------------------------
//    ------------------------------------------------------------end-----------------------------------------------------
//    ------------------------------------------------------------end-----------------------------------------------------

}