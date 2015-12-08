// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzfb, zzip, zzhu, zzfc

public class zzew extends zzfb
{

    static final Set zzzo = new HashSet(Arrays.asList(new String[] {
        "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"
    }));
    private int zznP;
    private int zznQ;
    private final zzip zzoL;
    private final Object zzpc = new Object();
    private AdSizeParcel zzyK;
    private RelativeLayout zzzA;
    private ViewGroup zzzB;
    private String zzzp;
    private boolean zzzq;
    private int zzzr;
    private int zzzs;
    private int zzzt;
    private int zzzu;
    private final Activity zzzv;
    private ImageView zzzw;
    private LinearLayout zzzx;
    private zzfc zzzy;
    private PopupWindow zzzz;

    public zzew(zzip zzip1, zzfc zzfc1)
    {
        super(zzip1, "resize");
        zzzp = "top-right";
        zzzq = true;
        zzzr = 0;
        zzzs = 0;
        zznQ = -1;
        zzzt = 0;
        zzzu = 0;
        zznP = -1;
        zzoL = zzip1;
        zzzv = zzip1.zzgN();
        zzzy = zzfc1;
    }

    private int[] zzdX()
    {
        if (!zzdZ())
        {
            return null;
        }
        if (zzzq)
        {
            return (new int[] {
                zzzr + zzzt, zzzs + zzzu
            });
        }
        int ai[] = zzp.zzbx().zzh(zzzv);
        int ai1[] = zzp.zzbx().zzj(zzzv);
        int l = ai[0];
        int j = zzzr + zzzt;
        int k = zzzs + zzzu;
        int i;
        if (j < 0)
        {
            i = 0;
        } else
        {
            i = j;
            if (zznP + j > l)
            {
                i = l - zznP;
            }
        }
        if (k < ai1[0])
        {
            j = ai1[0];
        } else
        {
            j = k;
            if (zznQ + k > ai1[1])
            {
                j = ai1[1] - zznQ;
            }
        }
        return (new int[] {
            i, j
        });
    }

    private void zzf(Map map)
    {
        if (!TextUtils.isEmpty((CharSequence)map.get("width")))
        {
            zznP = zzp.zzbx().zzax((String)map.get("width"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("height")))
        {
            zznQ = zzp.zzbx().zzax((String)map.get("height"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetX")))
        {
            zzzt = zzp.zzbx().zzax((String)map.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetY")))
        {
            zzzu = zzp.zzbx().zzax((String)map.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("allowOffscreen")))
        {
            zzzq = Boolean.parseBoolean((String)map.get("allowOffscreen"));
        }
        map = (String)map.get("customClosePosition");
        if (!TextUtils.isEmpty(map))
        {
            zzzp = map;
        }
    }

    public void zza(int i, int j, boolean flag)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        zzzr = i;
        zzzs = j;
        if (zzzz == null || !flag)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        int ai[] = zzdX();
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        zzzz.update(zzk.zzcE().zzb(zzzv, ai[0]), zzk.zzcE().zzb(zzzv, ai[1]), zzzz.getWidth(), zzzz.getHeight());
        zzc(ai[0], ai[1]);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        zzn(true);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void zzb(int i, int j)
    {
        if (zzzy != null)
        {
            zzzy.zza(i, j, zznP, zznQ);
        }
    }

    void zzc(int i, int j)
    {
        zzb(i, j - zzp.zzbx().zzj(zzzv)[0], zznP, zznQ);
    }

    public void zzd(int i, int j)
    {
        zzzr = i;
        zzzs = j;
    }

    boolean zzdW()
    {
        return zznP > -1 && zznQ > -1;
    }

    public boolean zzdY()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzzz != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    boolean zzdZ()
    {
        int ai[];
        int i;
        int k;
        int ai1[] = zzp.zzbx().zzh(zzzv);
        ai = zzp.zzbx().zzj(zzzv);
        k = ai1[0];
        i = ai1[1];
        if (zznP >= 50 && zznP <= k) goto _L2; else goto _L1
_L1:
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("Width is too small or too large.");
_L18:
        return false;
_L2:
        String s;
        if (zznQ < 50 || zznQ > i)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Height is too small or too large.");
            return false;
        }
        if (zznQ == i && zznP == k)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Cannot resize to a full-screen ad.");
            return false;
        }
        if (!zzzq)
        {
            break; /* Loop/switch isn't completed */
        }
        s = zzzp;
        i = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 180
    //                   -1364013995: 311
    //                   -1012429441: 283
    //                   -655373719: 325
    //                   1163912186: 353
    //                   1288627767: 339
    //                   1755462605: 297;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        i;
        JVM INSTR tableswitch 0 5: default 220
    //                   0 367
    //                   1 393
    //                   2 427
    //                   3 471
    //                   4 505
    //                   5 547;
           goto _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L10:
        int j;
        j = (zzzr + zzzt + zznP) - 50;
        i = zzzs + zzzu;
_L19:
        if (j < 0 || j + 50 > k || i < ai[0] || i + 50 > ai[1]) goto _L18; else goto _L17
_L17:
        return true;
_L5:
        if (s.equals("top-left"))
        {
            i = 0;
        }
          goto _L3
_L9:
        if (s.equals("top-center"))
        {
            i = 1;
        }
          goto _L3
_L4:
        if (s.equals("center"))
        {
            i = 2;
        }
          goto _L3
_L6:
        if (s.equals("bottom-left"))
        {
            i = 3;
        }
          goto _L3
_L8:
        if (s.equals("bottom-center"))
        {
            i = 4;
        }
          goto _L3
_L7:
        if (s.equals("bottom-right"))
        {
            i = 5;
        }
          goto _L3
_L11:
        i = zzzr;
        j = zzzt + i;
        i = zzzs + zzzu;
          goto _L19
_L12:
        j = (zzzr + zzzt + zznP / 2) - 25;
        i = zzzs + zzzu;
          goto _L19
_L13:
        j = (zzzr + zzzt + zznP / 2) - 25;
        i = (zzzs + zzzu + zznQ / 2) - 25;
          goto _L19
_L14:
        i = zzzr;
        j = zzzt + i;
        i = (zzzs + zzzu + zznQ) - 50;
          goto _L19
_L15:
        j = (zzzr + zzzt + zznP / 2) - 25;
        i = (zzzs + zzzu + zznQ) - 50;
          goto _L19
_L16:
        j = (zzzr + zzzt + zznP) - 50;
        i = (zzzs + zzzu + zznQ) - 50;
          goto _L19
        if (true) goto _L21; else goto _L20
_L21:
        if (true) goto _L18; else goto _L20
_L20:
    }

    public void zzg(Map map)
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzzv != null)
                {
                    break label0;
                }
                zzah("Not an activity context. Cannot resize.");
            }
            return;
        }
        if (zzoL.zzaN() != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        zzah("Webview is not yet available, size is not set.");
        obj;
        JVM INSTR monitorexit ;
        return;
        map;
        obj;
        JVM INSTR monitorexit ;
        throw map;
        if (!zzoL.zzaN().zzsH)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        zzah("Is interstitial. Cannot resize an interstitial.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!zzoL.zzgW())
        {
            break MISSING_BLOCK_LABEL_97;
        }
        zzah("Cannot resize an expanded banner.");
        obj;
        JVM INSTR monitorexit ;
        return;
        zzf(map);
        if (zzdW())
        {
            break MISSING_BLOCK_LABEL_119;
        }
        zzah("Invalid width and height options. Cannot resize.");
        obj;
        JVM INSTR monitorexit ;
        return;
        map = zzzv.getWindow();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        if (map.getDecorView() != null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        zzah("Activity context is not ready, cannot get window or decor view.");
        obj;
        JVM INSTR monitorexit ;
        return;
        int ai[] = zzdX();
        if (ai != null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        zzah("Resize location out of screen or close button is not visible.");
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        int i;
        int j;
        i = zzk.zzcE().zzb(zzzv, zznP);
        j = zzk.zzcE().zzb(zzzv, zznQ);
        obj1 = zzoL.getWebView().getParent();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (!(obj1 instanceof ViewGroup)) goto _L2; else goto _L3
_L3:
        ((ViewGroup)obj1).removeView(zzoL.getWebView());
        if (zzzz != null) goto _L5; else goto _L4
_L4:
        zzzB = (ViewGroup)obj1;
        obj1 = zzp.zzbx().zzj(zzoL.getWebView());
        zzzw = new ImageView(zzzv);
        zzzw.setImageBitmap(((android.graphics.Bitmap) (obj1)));
        zzyK = zzoL.zzaN();
        zzzB.addView(zzzw);
_L13:
        zzzA = new RelativeLayout(zzzv);
        zzzA.setBackgroundColor(0);
        zzzA.setLayoutParams(new android.view.ViewGroup.LayoutParams(i, j));
        zzzz = zzp.zzbx().zza(zzzA, i, j, false);
        zzzz.setOutsideTouchable(true);
        zzzz.setTouchable(true);
        obj1 = zzzz;
        String s;
        boolean flag;
        if (!zzzq)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj1)).setClippingEnabled(flag);
        zzzA.addView(zzoL.getWebView(), -1, -1);
        zzzx = new LinearLayout(zzzv);
        obj1 = new android.widget.RelativeLayout.LayoutParams(zzk.zzcE().zzb(zzzv, 50), zzk.zzcE().zzb(zzzv, 50));
        s = zzzp;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 1020
    //                   -1364013995: 767
    //                   -1012429441: 735
    //                   -655373719: 783
    //                   1163912186: 815
    //                   1288627767: 799
    //                   1755462605: 751;
           goto _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L22:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
_L21:
        zzzx.setOnClickListener(new android.view.View.OnClickListener() {

            final zzew zzzC;

            public void onClick(View view)
            {
                zzzC.zzn(true);
            }

            
            {
                zzzC = zzew.this;
                super();
            }
        });
        zzzx.setContentDescription("Close button");
        zzzA.addView(zzzx, ((android.view.ViewGroup.LayoutParams) (obj1)));
        zzzz.showAtLocation(map.getDecorView(), 0, zzk.zzcE().zzb(zzzv, ai[0]), zzk.zzcE().zzb(zzzv, ai[1]));
        zzb(ai[0], ai[1]);
        zzoL.zza(new AdSizeParcel(zzzv, new AdSize(zznP, zznQ)));
        zzc(ai[0], ai[1]);
        zzaj("resized");
        obj;
        JVM INSTR monitorexit ;
        return;
_L5:
        zzzz.dismiss();
          goto _L13
_L2:
        zzah("Webview is detached, probably in the middle of a resize or expand.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L8:
        if (!s.equals("top-left")) goto _L6; else goto _L14
_L14:
        i = 0;
          goto _L15
_L12:
        if (!s.equals("top-center")) goto _L6; else goto _L16
_L16:
        i = 1;
          goto _L15
_L7:
        if (!s.equals("center")) goto _L6; else goto _L17
_L17:
        i = 2;
          goto _L15
_L9:
        if (!s.equals("bottom-left")) goto _L6; else goto _L18
_L18:
        i = 3;
          goto _L15
_L11:
        if (!s.equals("bottom-center")) goto _L6; else goto _L19
_L19:
        i = 4;
          goto _L15
_L10:
        if (!s.equals("bottom-right")) goto _L6; else goto _L20
_L20:
        i = 5;
          goto _L15
_L23:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
          goto _L21
_L24:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
          goto _L21
_L25:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(13);
          goto _L21
_L26:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
          goto _L21
_L27:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
          goto _L21
_L28:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
          goto _L21
        map;
        zzah((new StringBuilder()).append("Cannot show popup window: ").append(map.getMessage()).toString());
        zzzA.removeView(zzoL.getWebView());
        if (zzzB != null)
        {
            zzzB.removeView(zzzw);
            zzzB.addView(zzoL.getWebView());
            zzoL.zza(zzyK);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
_L6:
        i = -1;
_L15:
        i;
        JVM INSTR tableswitch 0 5: default 1064
    //                   0 831
    //                   1 848
    //                   2 865
    //                   3 875
    //                   4 892
    //                   5 909;
           goto _L22 _L23 _L24 _L25 _L26 _L27 _L28
    }

    public void zzn(boolean flag)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzzz == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        zzzz.dismiss();
        zzzA.removeView(zzoL.getWebView());
        if (zzzB != null)
        {
            zzzB.removeView(zzzw);
            zzzB.addView(zzoL.getWebView());
            zzoL.zza(zzyK);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        zzaj("default");
        if (zzzy != null)
        {
            zzzy.zzbc();
        }
        zzzz = null;
        zzzA = null;
        zzzB = null;
        zzzx = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
