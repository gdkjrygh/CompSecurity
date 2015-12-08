// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzaw, zziq, zzan

public interface zzip
    extends zzaw
{

    public abstract void destroy();

    public abstract Context getContext();

    public abstract android.view.ViewGroup.LayoutParams getLayoutParams();

    public abstract void getLocationOnScreen(int ai[]);

    public abstract int getMeasuredHeight();

    public abstract int getMeasuredWidth();

    public abstract ViewParent getParent();

    public abstract String getRequestId();

    public abstract int getRequestedOrientation();

    public abstract WebView getWebView();

    public abstract boolean isDestroyed();

    public abstract void loadData(String s, String s1, String s2);

    public abstract void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4);

    public abstract void loadUrl(String s);

    public abstract void measure(int i, int j);

    public abstract void setBackgroundColor(int i);

    public abstract void setContext(Context context);

    public abstract void setOnClickListener(android.view.View.OnClickListener onclicklistener);

    public abstract void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener);

    public abstract void setRequestedOrientation(int i);

    public abstract void setWebViewClient(WebViewClient webviewclient);

    public abstract void setWillNotDraw(boolean flag);

    public abstract void stopLoading();

    public abstract boolean willNotDraw();

    public abstract void zzC(boolean flag);

    public abstract void zzD(boolean flag);

    public abstract void zzE(boolean flag);

    public abstract void zza(Context context, AdSizeParcel adsizeparcel);

    public abstract void zza(AdSizeParcel adsizeparcel);

    public abstract void zza(zzd zzd);

    public abstract void zza(String s, String s1);

    public abstract void zza(String s, JSONObject jsonobject);

    public abstract void zzaF(String s);

    public abstract void zzaG(String s);

    public abstract void zzaH(String s);

    public abstract AdSizeParcel zzaN();

    public abstract void zzb(zzd zzd);

    public abstract void zzb(String s, JSONObject jsonobject);

    public abstract void zzc(String s, Map map);

    public abstract void zzeD();

    public abstract void zzgM();

    public abstract Activity zzgN();

    public abstract Context zzgO();

    public abstract com.google.android.gms.ads.internal.zzd zzgP();

    public abstract zzd zzgQ();

    public abstract zzd zzgR();

    public abstract zziq zzgS();

    public abstract boolean zzgT();

    public abstract zzan zzgU();

    public abstract VersionInfoParcel zzgV();

    public abstract boolean zzgW();

    public abstract void zzgX();

    public abstract boolean zzgY();

    public abstract void zzgZ();

    public abstract String zzha();

    public abstract void zzv(int i);
}
