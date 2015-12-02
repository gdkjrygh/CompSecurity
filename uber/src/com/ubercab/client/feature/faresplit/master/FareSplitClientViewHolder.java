// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.faresplit.master;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import butterknife.ButterKnife;
import cgh;
import cgt;
import com.ubercab.rider.realtime.model.FareSplitClient;
import com.ubercab.ui.TextView;
import dty;

public class FareSplitClientViewHolder
{

    private Context a;
    private final cgh b;
    ImageButton mButtonRemove;
    ImageView mImageView;
    TextView mTextViewName;
    TextView mTextViewStatus;

    public FareSplitClientViewHolder(View view, android.view.View.OnClickListener onclicklistener, cgh cgh1)
    {
        a = view.getContext();
        b = cgh1;
        ButterKnife.inject(this, view);
        mButtonRemove.setContentDescription(a.getString(0x7f070242));
        mButtonRemove.setOnClickListener(onclicklistener);
    }

    private int a(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 64
    //                   -2081881145: 117
    //                   -522759168: 173
    //                   -58529607: 159
    //                   61987014: 187
    //                   632840270: 145
    //                   982065527: 131;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_187;
_L8:
        switch (byte0)
        {
        default:
            return a.getResources().getColor(0x7f0d0071);

        case 0: // '\0'
            return a.getResources().getColor(0x7f0d0053);

        case 1: // '\001'
            return a.getResources().getColor(0x7f0d0078);

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return a.getResources().getColor(0x7f0d006c);
        }
_L2:
        if (s.equals("Accepted"))
        {
            byte0 = 0;
        }
          goto _L8
_L7:
        if (s.equals("Pending"))
        {
            byte0 = 1;
        }
          goto _L8
_L6:
        if (s.equals("Declined"))
        {
            byte0 = 2;
        }
          goto _L8
_L4:
        if (s.equals("Canceled"))
        {
            byte0 = 3;
        }
          goto _L8
_L3:
        if (s.equals("InvalidNumber"))
        {
            byte0 = 4;
        }
          goto _L8
        if (s.equals("InviteFailed"))
        {
            byte0 = 5;
        }
          goto _L8
    }

    public final void a(FareSplitClient faresplitclient, int i, boolean flag)
    {
        byte byte0 = 8;
        boolean flag1 = false;
        String s = faresplitclient.getPictureUrl();
        if (!TextUtils.isEmpty(s))
        {
            b.a(s).a(0x7f02006f).b(0x7f02006f).a(mImageView);
        } else
        {
            mImageView.setImageResource(0x7f02006f);
        }
        mTextViewName.setText(dty.a(faresplitclient));
        s = dty.a(a, faresplitclient.getStatus());
        if (!TextUtils.isEmpty(s))
        {
            mTextViewStatus.setTextColor(a(faresplitclient.getStatus()));
            mTextViewStatus.setText(s);
            mTextViewStatus.setVisibility(0);
        } else
        {
            mTextViewStatus.setVisibility(8);
        }
        if (flag)
        {
            ImageButton imagebutton = mButtonRemove;
            if (!faresplitclient.getIsSelf())
            {
                byte0 = 0;
            }
            imagebutton.setVisibility(byte0);
        } else
        {
            ImageButton imagebutton1 = mButtonRemove;
            int j;
            if (faresplitclient.getIsSelf())
            {
                j = ((flag1) ? 1 : 0);
            } else
            {
                j = 8;
            }
            imagebutton1.setVisibility(j);
        }
        mButtonRemove.setTag(Integer.valueOf(i));
    }
}
