// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;

// Referenced classes of package io.card.payment:
//            ah, ag, CardScanner, aa, 
//            ab, DataEntryActivity, o, h, 
//            d, ad, p, l, 
//            n, CreditCard

public final class CardIOActivity extends Activity
{

    private static boolean A;
    public static final int a = 0xca8d10;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    static Bitmap f = null;
    private static int g;
    private static final long h[] = {
        0L, 70L, 10L, 40L
    };
    private static int i = 10;
    private static final int j = 10;
    private static int w = 0;
    private static boolean z = true;
    private aa k;
    private OrientationEventListener l;
    private ab m;
    private CreditCard n;
    private Rect o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private LinearLayout t;
    private RelativeLayout u;
    private FrameLayout v;
    private CardScanner x;
    private boolean y;

    public CardIOActivity()
    {
        r = false;
        s = false;
        y = false;
    }

    static CreditCard a(CardIOActivity cardioactivity, CreditCard creditcard)
    {
        cardioactivity.n = null;
        return null;
    }

    static aa a(CardIOActivity cardioactivity)
    {
        return cardioactivity.k;
    }

    private void a(float f1)
    {
        if (t != null)
        {
            RotateAnimation rotateanimation = new RotateAnimation(0.0F, f1, t.getWidth() / 2, t.getHeight() / 2);
            rotateanimation.setDuration(0L);
            rotateanimation.setRepeatCount(0);
            rotateanimation.setFillAfter(true);
            t.setAnimation(rotateanimation);
        }
    }

    private void a(int i1, Intent intent)
    {
        setResult(i1, intent);
        f = null;
        finish();
    }

    static void a(CardIOActivity cardioactivity, int i1)
    {
        cardioactivity.b(i1);
    }

    private void a(Exception exception)
    {
        String s1 = ag.a(ah.r);
        Log.e("card.io", "Unkown exception - please send the stack trace to support@card.io", exception);
        exception = Toast.makeText(this, s1, 1);
        exception.setGravity(17, 0, -75);
        exception.show();
        y = true;
    }

    private void a(boolean flag)
    {
        boolean flag1;
        if (m != null && k != null && x.b(flag))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            k.a(flag);
        }
    }

    static CreditCard b(CardIOActivity cardioactivity)
    {
        return cardioactivity.n;
    }

    private void b(int i1)
    {
        if (i1 >= 0 && x != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j1 = ((WindowManager)getSystemService("window")).getDefaultDisplay().getRotation();
        if (j1 == 0) goto _L4; else goto _L3
_L3:
        byte byte0;
        if (j1 == 1)
        {
            j1 = 90;
        } else
        {
label0:
            {
                if (j1 != 2)
                {
                    break label0;
                }
                j1 = 180;
            }
        }
_L6:
        j1 += i1;
        if (j1 > 360)
        {
            j1 -= 360;
        }
        byte0 = -1;
        if (j1 < 15 || j1 > 345)
        {
            q = 1;
            i1 = 0;
        } else
        if (j1 > 75 && j1 < 105)
        {
            q = 4;
            i1 = 90;
        } else
        if (j1 > 165 && j1 < 195)
        {
            i1 = 180;
            q = 2;
        } else
        {
            i1 = byte0;
            if (j1 > 255)
            {
                i1 = byte0;
                if (j1 < 285)
                {
                    q = 3;
                    i1 = 270;
                }
            }
        }
        if (i1 >= 0 && i1 != p)
        {
            (new StringBuilder("onOrientationChanged(")).append(i1).append(") calling setDeviceOrientation(").append(q).append(")").toString();
            x.a(q);
            c(i1);
            if (i1 == 90)
            {
                a(270F);
                return;
            }
            break MISSING_BLOCK_LABEL_264;
        }
        if (true) goto _L1; else goto _L4
        if (j1 != 3) goto _L4; else goto _L5
_L5:
        j1 = 270;
          goto _L6
_L4:
        j1 = 0;
          goto _L6
        if (i1 == 270)
        {
            a(90F);
            return;
        }
        a(i1);
        return;
          goto _L6
    }

    static int c()
    {
        return j;
    }

    private void c(int i1)
    {
        SurfaceView surfaceview = m.a();
        if (surfaceview == null)
        {
            Log.wtf("card.io", "surface view is null.. recovering... rotation might be weird.");
            return;
        } else
        {
            o = x.a(surfaceview.getWidth(), surfaceview.getHeight());
            Rect rect = o;
            rect.top = rect.top + surfaceview.getTop();
            rect = o;
            int j1 = rect.bottom;
            rect.bottom = surfaceview.getTop() + j1;
            k.a(o, i1);
            p = i1;
            return;
        }
    }

    static void c(CardIOActivity cardioactivity)
    {
        cardioactivity.d();
    }

    private void d()
    {
        if (!z)
        {
            return;
        }
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("io.card.payment.suppressConfirmation", false))
        {
            Intent intent1 = new Intent(this, io/card/payment/DataEntryActivity);
            intent1.putExtra("io.card.payment.scanResult", n);
            n = null;
            a(e, intent1);
            return;
        } else
        {
            (new Handler()).post(new o(this));
            return;
        }
    }

    private boolean e()
    {
        n = null;
        if (!A && m == null)
        {
            throw new AssertionError();
        }
        boolean flag = x.a(m.b());
        if (flag)
        {
            u.setVisibility(0);
        }
        return flag;
    }

    final void a()
    {
        boolean flag;
        if (!x.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    final void a(int i1)
    {
        SurfaceView surfaceview = m.a();
        if (k != null)
        {
            k.a(new Rect(surfaceview.getLeft(), surfaceview.getTop(), surfaceview.getRight(), surfaceview.getBottom()));
        }
        q = 1;
        c(0);
        if (1 != q)
        {
            Log.wtf("card.io", "the orientation of the scanner doesn't match the orientation of the activity");
        }
        a(new h());
    }

    final void a(Bitmap bitmap, h h1)
    {
        float f1;
        try
        {
            ((Vibrator)getSystemService("vibrator")).vibrate(h, -1);
        }
        catch (SecurityException securityexception)
        {
            Log.e("card.io", "Could not activate vibration feedback. Please add <uses-permission android:name=\"android.permission.VIBRATE\" /> to your application's manifest.");
        }
        catch (Exception exception)
        {
            Log.w("card.io", "Exception while attempting to vibrate: ", exception);
        }
        x.c();
        u.setVisibility(4);
        if (h1.b())
        {
            n = h1.c();
            k.a(n);
        }
        if (q == 1 || q == 2)
        {
            f1 = ((float)o.right / 428F) * 0.95F;
        } else
        {
            f1 = ((float)o.right / 428F) * 1.15F;
        }
        h1 = new Matrix();
        (new StringBuilder("Scale factor: ")).append(f1).toString();
        h1.postScale(f1, f1);
        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), h1, false);
        k.a(bitmap);
        if (s && z)
        {
            h1 = new ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, h1);
            bitmap = new Intent();
            a(d, ((Intent) (bitmap)));
            return;
        } else
        {
            d();
            return;
        }
    }

    final void a(h h1)
    {
        k.a(h1);
    }

    final void b()
    {
        x.a(true);
    }

    protected final void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        String.format("onActivityResult(requestCode:%d, resultCode:%d, ...", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1)
        });
        if (j1 == a || j1 == b || y)
        {
            if (intent != null && intent.hasExtra("io.card.payment.scanResult"))
            {
                (new StringBuilder("data entry result: ")).append(intent.getParcelableExtra("io.card.payment.scanResult")).toString();
            }
            a(j1, intent);
        } else
        if (u != null)
        {
            u.setVisibility(0);
            return;
        }
    }

    public final void onBackPressed()
    {
        if (y || !k.c())
        {
            break MISSING_BLOCK_LABEL_49;
        }
        e();
_L1:
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("CardIOActivity", (new StringBuilder("*** could not return to preview: ")).append(runtimeexception).toString());
        return;
        if (x != null)
        {
            super.onBackPressed();
            return;
        }
          goto _L1
    }

    protected final void onCreate(Bundle bundle)
    {
        int i1 = w + 1;
        w = i1;
        if (i1 != 1)
        {
            String.format("INTERNAL WARNING: There are %d (not 1) CardIOActivity allocations!", new Object[] {
                Integer.valueOf(w)
            });
        }
        super.onCreate(bundle);
        bundle = getIntent();
        ag.a(bundle);
        s = false;
        String s1 = ad.a(getPackageManager().resolveActivity(bundle, 0x10000), io/card/payment/CardIOActivity);
        if (s1 != null)
        {
            throw new RuntimeException(s1);
        }
        r = bundle.getBooleanExtra("io.card.payment.suppressManual", false);
        if (!bundle.getBooleanExtra("io.card.payment.noCamera", false)) goto _L2; else goto _L1
_L1:
        y = true;
_L9:
        if (!z || y) goto _L4; else goto _L3
_L3:
        requestWindowFeature(1);
        o = new Rect();
        q = 1;
        if (!bundle.getBooleanExtra("io.card.payment.cameraBypassTestMode", false)) goto _L6; else goto _L5
_L5:
        if (!getPackageName().contentEquals("io.card.development"))
        {
            Log.e("CardIOActivity", (new StringBuilder()).append(getPackageName()).append(" is not correct").toString());
            throw new IllegalStateException("illegal access of private extra");
        }
          goto _L7
        bundle;
        a(bundle);
_L4:
        if ((y || !z) && r)
        {
            a(c, ((Intent) (null)));
        }
        return;
_L2:
        if (ad.a()) goto _L9; else goto _L8
_L8:
        ah ah1 = ah.p;
        String s2 = ag.a(ah1);
        Log.w("card.io", (new StringBuilder()).append(ah1).append(": ").append(s2).toString());
        y = true;
          goto _L9
        Object obj;
        obj;
        Object obj1 = ah.q;
        String s3 = ag.a(((ah) (obj1)));
        Log.e("card.io", (new StringBuilder()).append(obj1).append(": ").append(s3).toString());
        obj1 = Toast.makeText(this, s3, 1);
        ((Toast) (obj1)).setGravity(17, 0, -75);
        ((Toast) (obj1)).show();
        y = true;
          goto _L9
        obj1;
        a(((Exception) (obj1)));
          goto _L9
_L7:
        x = (CardScanner)Class.forName("io.card.payment.CardScannerTester").getConstructor(new Class[] {
            getClass(), Integer.TYPE
        }).newInstance(new Object[] {
            this, Integer.valueOf(q)
        });
_L12:
        Object obj2;
        x.b();
        v = new FrameLayout(this);
        v.setBackgroundColor(0xff000000);
        v.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        obj2 = new FrameLayout(this);
        ((FrameLayout) (obj2)).setId(1);
        x.getClass();
        x.getClass();
        m = new ab(this, null, 640, 480);
        m.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1, 48));
        ((FrameLayout) (obj2)).addView(m);
        k = new aa(this, null, ad.a(this));
        k.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        if (getIntent() == null) goto _L11; else goto _L10
_L10:
        int j1;
        boolean flag = getIntent().getBooleanExtra("io.card.payment.useCardIOLogo", false);
        k.b(flag);
        j1 = getIntent().getIntExtra("io.card.payment.guideColor", 0);
        int l1;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_1009;
        }
        l1 = 0xff000000 | j1;
        if (j1 == l1)
        {
            break MISSING_BLOCK_LABEL_658;
        }
        Log.w("card.io", "Removing transparency from provided guide color.");
        k.a(l1);
_L11:
        ((FrameLayout) (obj2)).addView(k);
        bundle = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        bundle.addRule(10);
        bundle.addRule(2, 2);
        v.addView(((View) (obj2)), bundle);
        u = new RelativeLayout(this);
        u.setGravity(80);
        obj2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        bundle.addRule(12);
        u.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
        u.setId(2);
        u.setGravity(85);
        if (!r)
        {
            bundle = new Button(this);
            bundle.setId(3);
            bundle.setText(ag.a(ah.m));
            bundle.setTextSize(12F);
            bundle.setOnClickListener(new p(this));
            u.addView(bundle);
            io.card.payment.l.a(bundle, false, this);
            bundle.setTextSize(14F);
            bundle.setMinimumHeight(io.card.payment.l.a("42dip", this));
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)bundle.getLayoutParams();
            layoutparams.width = -2;
            layoutparams.height = -2;
            layoutparams.addRule(12);
            io.card.payment.l.a(bundle, "16dip", null, "16dip", null);
            io.card.payment.l.b(bundle, "4dip", "4dip", "4dip", "4dip");
        }
        bundle = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        bundle.addRule(12);
        int k1 = (int)(getResources().getDisplayMetrics().density * 15F + 0.5F);
        bundle.setMargins(0, k1, 0, k1);
        v.addView(u, bundle);
        setContentView(v);
        l = new n(this, this, 2);
          goto _L4
_L6:
        x = new CardScanner(this, q);
          goto _L12
        k.a(0xff00ff00);
          goto _L11
    }

    protected final void onDestroy()
    {
        k = null;
        w--;
        if (x != null)
        {
            x.d();
            x = null;
        }
        super.onDestroy();
    }

    protected final void onPause()
    {
        super.onPause();
        if (l != null)
        {
            l.disable();
        }
        a(false);
        if (x != null)
        {
            x.c();
        } else
        if (!y)
        {
            Log.wtf("card.io", "cardScanner is null in onPause()");
            return;
        }
    }

    protected final void onResume()
    {
        super.onResume();
        if (y)
        {
            d();
            return;
        }
        if (!z)
        {
            Log.e("card.io", "This app is not authorized to scan");
            a(0, ((Intent) (null)));
            return;
        }
        ad.b();
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        setRequestedOrientation(1);
        l.enable();
        if (!e())
        {
            Log.e("CardIOActivity", "Could not connect to camera.");
            String s1 = ag.a(ah.r);
            Log.e("card.io", (new StringBuilder("error display: ")).append(s1).toString());
            Toast.makeText(this, s1, 1).show();
            d();
        } else
        {
            a(false);
        }
        b(p);
    }

    static 
    {
        int i1;
        boolean flag;
        if (!io/card/payment/CardIOActivity.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        A = flag;
        g = 0xca8d10;
        g = 0xca8d11;
        i1 = g;
        g = i1 + 1;
        b = i1;
        i1 = g;
        g = i1 + 1;
        c = i1;
        i1 = g;
        g = i1 + 1;
        d = i1;
        i1 = g;
        g = i1 + 1;
        e = i1;
        i = 11;
    }
}
