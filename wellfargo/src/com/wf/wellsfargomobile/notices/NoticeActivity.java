// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.notices;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.common.d;
import com.wf.wellsfargomobile.BaseActivity;
import com.wf.wellsfargomobile.WFApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// Referenced classes of package com.wf.wellsfargomobile.notices:
//            a

public class NoticeActivity extends BaseActivity
{

    private boolean a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private TextView f;
    private TextView g;
    private TextView h;
    private ScrollView i;

    public NoticeActivity()
    {
        a = true;
        b = true;
        c = true;
    }

    static int a(NoticeActivity noticeactivity)
    {
        return noticeactivity.d;
    }

    static int b(NoticeActivity noticeactivity)
    {
        return noticeactivity.e;
    }

    static ScrollView c(NoticeActivity noticeactivity)
    {
        return noticeactivity.i;
    }

    public void closeViewAsDialog(View view)
    {
        finish();
        overridePendingTransition(0x7f05000d, 0x7f05000f);
    }

    public void onBackPressed()
    {
        closeViewAsDialog(null);
    }

    protected void onCreate(Bundle bundle)
    {
        Object obj;
        Object obj1;
        InputStream inputstream;
        obj = null;
        obj1 = null;
        inputstream = null;
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setFinishOnTouchOutside(false);
        }
        setContentView(0x7f04003e);
        i = (ScrollView)findViewById(0x7f0f00d6);
        Object obj2 = Typeface.createFromAsset(getAssets(), "fonts/02534_ArialFett2.ttf");
        ((TextView)findViewById(0x7f0f00d5)).setTypeface(((Typeface) (obj2)));
        f = (TextView)findViewById(0x7f0f00d9);
        IOException ioexception1;
        Object obj3;
        String s;
        if (WFApp.q())
        {
            f.setText(com.google.android.gms.common.d.c(this));
        } else
        {
            findViewById(0x7f0f00d7).setVisibility(8);
            findViewById(0x7f0f00da).setVisibility(8);
        }
        obj3 = new StringBuilder(9000);
        obj2 = getAssets().open("gson_LICENSE.txt");
        obj = obj2;
        obj2 = new BufferedReader(new InputStreamReader(((InputStream) (obj))));
_L3:
        s = ((BufferedReader) (obj2)).readLine();
        if (s == null) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj3)).append(s).append("\n");
          goto _L3
        ioexception1;
_L11:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
_L7:
        g = (TextView)findViewById(0x7f0f00dc);
        g.setText(((StringBuilder) (obj3)).toString());
        ioexception1 = new StringBuilder(9000);
        obj = inputstream;
        inputstream = getAssets().open("leakcanary_LICENSE.txt");
        obj = inputstream;
        obj1 = inputstream;
        obj3 = new BufferedReader(new InputStreamReader(inputstream));
_L5:
        obj = inputstream;
        obj1 = inputstream;
        s = ((BufferedReader) (obj3)).readLine();
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = inputstream;
        obj1 = inputstream;
        ioexception1.append(s).append("\n");
        if (true) goto _L5; else goto _L4
_L4:
        obj1;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        h = (TextView)findViewById(0x7f0f00de);
        h.setText(ioexception1.toString());
        if (bundle != null)
        {
            a = bundle.getBoolean("google_play");
            b = bundle.getBoolean("gson");
            c = bundle.getBoolean("leakcanary");
            d = bundle.getInt("scroll_x_axis");
            e = bundle.getInt("scroll_y_axis");
            i.post(new a(this));
        }
        if (a)
        {
            f.setVisibility(8);
        } else
        {
            f.setVisibility(0);
        }
        if (b)
        {
            g.setVisibility(8);
        } else
        {
            g.setVisibility(0);
        }
        if (c)
        {
            h.setVisibility(8);
            return;
        } else
        {
            h.setVisibility(0);
            return;
        }
_L2:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (true) goto _L7; else goto _L6
        bundle;
_L9:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw bundle;
_L6:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        break MISSING_BLOCK_LABEL_304;
        bundle;
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw bundle;
        bundle;
        if (true) goto _L9; else goto _L8
_L8:
        IOException ioexception;
        ioexception;
        ioexception = null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        a = bundle.getBoolean("google_play");
        b = bundle.getBoolean("gson");
        c = bundle.getBoolean("leakcanary");
        d = bundle.getInt("scroll_x_axis");
        e = bundle.getInt("scroll_y_axis");
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("google_play", a);
        bundle.putBoolean("gson", b);
        bundle.putBoolean("leakcanary", c);
        bundle.putInt("scroll_x_axis", i.getScrollX());
        bundle.putInt("scroll_y_axis", i.getScrollY());
        super.onSaveInstanceState(bundle);
    }

    public void toggleGooglePlayServices(View view)
    {
        view = (ImageView)findViewById(0x7f0f00d8);
        boolean flag;
        if (f.getVisibility() == 8)
        {
            f.setVisibility(0);
            view.setImageResource(0x7f020045);
        } else
        {
            f.setVisibility(8);
            view.setImageResource(0x7f020044);
        }
        if (f.getVisibility() == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    public void toggleGson(View view)
    {
        view = (ImageView)findViewById(0x7f0f00db);
        boolean flag;
        if (g.getVisibility() == 8)
        {
            g.setVisibility(0);
            view.setImageResource(0x7f020045);
        } else
        {
            g.setVisibility(8);
            view.setImageResource(0x7f020044);
        }
        if (g.getVisibility() == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }

    public void toggleLeakCanary(View view)
    {
        view = (ImageView)findViewById(0x7f0f00dd);
        boolean flag;
        if (h.getVisibility() == 8)
        {
            h.setVisibility(0);
            view.setImageResource(0x7f020045);
        } else
        {
            h.setVisibility(8);
            view.setImageResource(0x7f020044);
        }
        if (h.getVisibility() == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
