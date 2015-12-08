// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import com.sessionm.api.SessionM;
import com.sessionm.api.User;
import com.sessionm.ui.BadgeView;

public class PortalButton extends ImageButton
{

    private BadgeView badge;

    public PortalButton(Context context)
    {
        super(context);
        initialize();
    }

    private void initialize()
    {
        setOnClickListener(new android.view.View.OnClickListener() {

            final PortalButton this$0;

            public void onClick(View view)
            {
                SessionM.getInstance().presentActivity(com.sessionm.api.SessionM.ActivityType.PORTAL);
            }

            
            {
                this$0 = PortalButton.this;
                super();
            }
        });
    }

    private void showBadge()
    {
        badge.setBadgePosition(5);
        badge.setBadgeMargin(6, 6);
        badge.setTextSize(10F);
        badge.show();
    }

    public void updateButton()
    {
        if (badge == null)
        {
            badge = new BadgeView(getContext(), this);
        }
        if (SessionM.getInstance().getSessionState() == com.sessionm.api.SessionM.State.STARTED_ONLINE)
        {
            setEnabled(true);
            int i = SessionM.getInstance().getUser().getUnclaimedAchievementCount();
            if (i > 0)
            {
                badge.setText(String.valueOf(i));
                showBadge();
                return;
            } else
            {
                badge.setText(null);
                badge.hide();
                return;
            }
        } else
        {
            setEnabled(false);
            badge.setText(null);
            badge.hide();
            return;
        }
    }
}
