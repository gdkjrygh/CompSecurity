// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.chat;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import fuj;
import fum;

// Referenced classes of package com.ubercab.client.feature.trip.chat:
//            RecordButton

public class ChatComposerView extends LinearLayout
    implements fum
{

    private fuj a;
    ImageButton mImageButtonCall;
    ImageButton mImageButtonText;
    RecordButton mRecordButton;
    TextView mTextViewRecordingStatus;

    public ChatComposerView(Context context)
    {
        this(context, null);
    }

    public ChatComposerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ChatComposerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        inflate(context, 0x7f03003c, this);
    }

    public final void a(int i)
    {
        int k;
        int l;
        k = 0;
        l = 0x7f0d008e;
        i;
        JVM INSTR tableswitch 1 5: default 44
    //                   1 190
    //                   2 206
    //                   3 158
    //                   4 54
    //                   5 133;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalStateException("Illegal touch state");
_L5:
        int j;
        if (a != null)
        {
            a.g();
        }
        i = 0x7f07026b;
        j = 0x7f0d0078;
_L8:
        Resources resources = getContext().getResources();
        setBackgroundColor(resources.getColor(l));
        mImageButtonCall.setVisibility(k);
        mImageButtonText.setVisibility(k);
        mTextViewRecordingStatus.setText(i);
        mTextViewRecordingStatus.setTextColor(resources.getColor(j));
        return;
_L6:
        if (a != null)
        {
            a.f();
        }
        i = 0x7f07026b;
        j = 0x7f0d0078;
        continue; /* Loop/switch isn't completed */
_L4:
        if (a != null)
        {
            a.h();
        }
        j = 0x7f0d008e;
        l = 0x7f0d0078;
        i = 0x7f070484;
        k = 4;
        continue; /* Loop/switch isn't completed */
_L2:
        j = 0x7f0d008e;
        l = 0x7f0d0078;
        i = 0x7f070484;
        k = 4;
        continue; /* Loop/switch isn't completed */
_L3:
        j = 0x7f0d008e;
        l = 0x7f0d006c;
        i = 0x7f070397;
        k = 4;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(fuj fuj1)
    {
        a = fuj1;
    }

    public void onCallClicked()
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (!isInEditMode())
        {
            ButterKnife.inject(this);
            mRecordButton.a(this);
        }
    }

    public void onTextClicked()
    {
    }
}
