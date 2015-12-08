// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.Window;
import android.widget.TextView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.android.a.c;
import com.google.zxing.f;
import com.google.zxing.g;
import java.io.IOException;

// Referenced classes of package com.google.zxing.client.android:
//            CaptureActivityHandler, l, c, d, 
//            i, ViewfinderView, k, j

public final class CaptureActivity extends Activity
    implements android.view.SurfaceHolder.Callback
{

    private static final String a = com/google/zxing/client/android/CaptureActivity.getCanonicalName();
    private c b;
    private CaptureActivityHandler c;
    private ViewfinderView d;
    private TextView e;
    private boolean f;
    private String g;
    private d h;

    public CaptureActivity()
    {
    }

    private static void a(Canvas canvas, Paint paint, g g1, g g2)
    {
        canvas.drawLine(g1.a(), g1.b(), g2.a(), g2.b(), paint);
    }

    private void a(SurfaceHolder surfaceholder)
    {
        try
        {
            b.a(surfaceholder);
            if (c == null)
            {
                c = new CaptureActivityHandler(this, g, b);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            Log.w(a, surfaceholder);
            e();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            Log.w(a, "Unexpected error initializing camera", surfaceholder);
        }
        e();
    }

    private void e()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("");
        builder.setMessage(getString(l.a));
        builder.setPositiveButton(0x104000a, new com.google.zxing.client.android.c(this));
        builder.setOnCancelListener(new com.google.zxing.client.android.c(this));
        builder.show();
    }

    final ViewfinderView a()
    {
        return d;
    }

    public final void a(f f1, Bitmap bitmap)
    {
        int i1;
        i1 = 0;
        h.a();
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        Log.e(a, "Barcode not recognized");
        setResult(0, null);
_L4:
        finish();
        return;
_L2:
        g ag[];
        Canvas canvas;
        Paint paint;
        ag = f1.c();
        if (ag != null && ag.length > 0)
        {
            canvas = new Canvas(bitmap);
            paint = new Paint();
            paint.setColor(getResources().getColor(i.b));
            paint.setStrokeWidth(3F);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.drawRect(new Rect(2, 2, bitmap.getWidth() - 2, bitmap.getHeight() - 2), paint);
            paint.setColor(getResources().getColor(com.google.zxing.client.android.i.c));
            if (ag.length != 2)
            {
                break; /* Loop/switch isn't completed */
            }
            paint.setStrokeWidth(4F);
            a(canvas, paint, ag[0], ag[1]);
        }
_L5:
        Log.d(a, (new StringBuilder("Barcode is: ")).append(f1.a()).toString());
        bitmap = new Intent();
        bitmap.putExtra("SCAN_RESULT", f1.a());
        setResult(-1, bitmap);
        if (true) goto _L4; else goto _L3
_L3:
        if (ag.length == 4 && (f1.d() == BarcodeFormat.UPC_A || f1.d() == BarcodeFormat.EAN_13))
        {
            a(canvas, paint, ag[0], ag[1]);
            a(canvas, paint, ag[2], ag[3]);
        } else
        {
            paint.setStrokeWidth(10F);
            int j1 = ag.length;
            while (i1 < j1) 
            {
                bitmap = ag[i1];
                canvas.drawPoint(bitmap.a(), bitmap.b(), paint);
                i1++;
            }
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final Handler b()
    {
        return c;
    }

    final c c()
    {
        return b;
    }

    public final void d()
    {
        d.a();
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(k.a);
        e = (TextView)findViewById(j.j);
        c = null;
        f = false;
        h = new d(this);
    }

    protected final void onDestroy()
    {
        h.d();
        super.onDestroy();
    }

    public final boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            setResult(0);
            finish();
        } else
        if (i1 != 80 && i1 != 27)
        {
            return super.onKeyDown(i1, keyevent);
        }
        return true;
    }

    protected final void onPause()
    {
        if (c != null)
        {
            c.a();
            c = null;
        }
        h.b();
        b.a();
        if (!f)
        {
            ((SurfaceView)findViewById(com.google.zxing.client.android.j.f)).getHolder().removeCallback(this);
        }
        super.onPause();
    }

    protected final void onResume()
    {
        super.onResume();
        b = new c(getApplication());
        d = (ViewfinderView)findViewById(j.k);
        d.setCameraManager(b);
        e.setText(l.b);
        e.setVisibility(0);
        d.setVisibility(0);
        Object obj = ((SurfaceView)findViewById(com.google.zxing.client.android.j.f)).getHolder();
        Intent intent;
        if (f)
        {
            a(((SurfaceHolder) (obj)));
        } else
        {
            ((SurfaceHolder) (obj)).addCallback(this);
            ((SurfaceHolder) (obj)).setType(3);
        }
        intent = getIntent();
        if (intent == null)
        {
            obj = null;
        } else
        {
            obj = intent.getAction();
        }
        if (intent != null)
        {
            intent.getDataString();
        }
        if (intent != null && obj != null)
        {
            if (((String) (obj)).equals("com.google.zxing.client.android.YOUTUBE_SCAN") && intent.hasExtra("SCAN_WIDTH") && intent.hasExtra("SCAN_HEIGHT"))
            {
                int i1 = intent.getIntExtra("SCAN_WIDTH", 0);
                int j1 = intent.getIntExtra("SCAN_HEIGHT", 0);
                if (i1 > 0 && j1 > 0)
                {
                    b.a(i1, j1);
                }
            }
            g = intent.getStringExtra("CHARACTER_SET");
        } else
        {
            finish();
        }
        h.c();
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
        if (surfaceholder == null)
        {
            Log.e(a, "*** WARNING *** surfaceCreated() gave us a null surface!");
        }
        if (!f)
        {
            f = true;
            a(surfaceholder);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        f = false;
    }

}
