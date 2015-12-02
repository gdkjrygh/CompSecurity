// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife;
import cgh;
import cgt;
import com.ubercab.client.core.model.Invite;
import com.ubercab.ui.TextView;

// Referenced classes of package com.ubercab.client.feature.share:
//            InviteAdapter

class mViewSeparatorLine
{

    final InviteAdapter a;
    ImageView mImageViewPicture;
    TextView mTextViewDetails;
    TextView mTextViewName;
    View mViewContainer;
    View mViewSeparatorLine;

    private static int a(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   -1616953765: 71
    //                   -1149187101: 99
    //                   35394935: 85;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_99;
_L5:
        switch (byte0)
        {
        default:
            return 0x7f0706a4;

        case 0: // '\0'
            return 0x7f070402;

        case 1: // '\001'
            return 0x7f070403;

        case 2: // '\002'
            return 0x7f070404;
        }
_L2:
        if (s.equals("INVITED"))
        {
            byte0 = 0;
        }
          goto _L5
_L4:
        if (s.equals("PENDING"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("SUCCESS"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    final void a(Invite invite)
    {
        String s;
        if (!TextUtils.isEmpty(invite.getFullName()))
        {
            s = invite.getFullName();
        } else
        {
            s = invite.getEmail();
        }
        mTextViewName.setText(s);
        mTextViewDetails.setText(a(invite.getInviteStatus()));
        InviteAdapter.b(a).a(invite.getAvatarUrl()).a(0x7f02006f).b(0x7f02006f).a(mImageViewPicture);
    }

    (InviteAdapter inviteadapter, View view)
    {
        a = inviteadapter;
        super();
        ButterKnife.inject(this, view);
        mViewContainer.setPadding(InviteAdapter.a(inviteadapter), 0, InviteAdapter.a(inviteadapter), 0);
        mViewSeparatorLine.setVisibility(0);
    }
}
