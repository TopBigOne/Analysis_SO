package pro.hogiouxm.adcr.nh0bh6q;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

import java.util.ArrayList;
import java.util.HashMap;

import name.ktzmgatzx.fcn.y14s9rbsf2orv0.AwJlo;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.BdYxpl;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Ceyke;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.CqDgdk;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Drgq;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.EzEx;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Gek;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Hlxt;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Jeczh;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.JmRo;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.LlUwc;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Lmqc;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.LuTaq;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Naby;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Nuq;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.OpByj;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Puuaq;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Qyrfx;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Vzi;
import name.ktzmgatzx.fcn.y14s9rbsf2orv0.Yse;

/**
 * 启动界面
 */
public class UdpkxUfoActivity extends Activity implements InstallReferrerStateListener {

    InstallReferrerClient mInstallReferrerClient;


    @Override
    protected void onCreate(Bundle bundle) {
        // 有用
        ckwHsPyr();
        super.onCreate(bundle);
    }

    private void init() {
        // C++ 函数
        zmjFwpv();
    }

    // C++ 函数
    public native void zmjFwpv();

    /**
     * call by onCreate().
     */
    public void ckwHsPyr() {

        this.mInstallReferrerClient = InstallReferrerClient.newBuilder(getApplication()).build();

        this.mInstallReferrerClient.startConnection(this);
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        init();
    }

    /**
     * Android 平台上的一个接口，用于与应用安装引用程序（Install Referrer）进行通信。Install Referrer 是一个机制，
     * 用于跟踪应用安装来源的相关信息，例如通过广告点击或推广活动等方式引导用户安装应用。
     */
    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
        init();
    }

}