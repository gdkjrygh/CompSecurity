// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.a;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.wf.wellsfargomobile.BaseActionBarActivity;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.mrdc:
//            ImageModeType, o, l

public class ReviewCheckImageActivity extends BaseActionBarActivity
{

    private ImageModeType b;
    private Button c;

    public ReviewCheckImageActivity()
    {
        b = null;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        updateUserLocale();
        a.b();
        setContentView(0x7f04004f);
        setRequestedOrientation(0);
        bundle = getIntent().getSerializableExtra("MRDC_FLOW_STATE");
        if (bundle == null)
        {
            b = ImageModeType.FRONT;
        } else
        {
            b = (ImageModeType)bundle;
        }
        bundle = (ImageView)findViewById(0x7f0f00fc);
        com.wf.wellsfargomobile.mrdc.o.a[b.ordinal()];
        JVM INSTR tableswitch 1 2: default 92
    //                   1 138
    //                   2 165;
           goto _L1 _L2 _L3
_L1:
        c = (Button)findViewById(0x7f0f00fe);
        c.setEnabled(true);
        WFApp.a(this, (ImageView)findViewById(0x7f0f0061));
        return;
_L2:
        android.graphics.Bitmap bitmap = WFApp.t();
        if (bitmap != null)
        {
            bundle.setImageBitmap(bitmap);
        } else
        {
            Log.d("ReviewCheckImgActivity", "FRONT image is null");
        }
        continue; /* Loop/switch isn't completed */
_L3:
        android.graphics.Bitmap bitmap1 = WFApp.u();
        if (bitmap1 != null)
        {
            bundle.setImageBitmap(bitmap1);
        } else
        {
            Log.d("ReviewCheckImgActivity", "REAR image is null");
        }
        ((TextView)findViewById(0x7f0f0100)).setText(getString(0x7f0800e3));
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onRetakePicture(View view)
    {
        c.setEnabled(false);
        com.wf.wellsfargomobile.mrdc.o.a[b.ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 45
    //                   2 54;
           goto _L1 _L2 _L3
_L1:
        finish();
        return;
_L2:
        setResult(17);
        continue; /* Loop/switch isn't completed */
_L3:
        setResult(19);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onUsePicture(View view)
    {
        c.setEnabled(false);
        com.wf.wellsfargomobile.mrdc.o.a[b.ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 45
    //                   2 54;
           goto _L1 _L2 _L3
_L1:
        finish();
        return;
_L2:
        setResult(16);
        continue; /* Loop/switch isn't completed */
_L3:
        setResult(18);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void openPhotoTips(View view)
    {
        (new l(view.getContext())).openPhotoTips(WFApp.o());
    }
}
