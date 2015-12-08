// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.sessionm.api.AchievementData;
import com.sessionm.api.Activity;
import com.sessionm.api.SessionListener;
import com.sessionm.api.SessionM;
import com.sessionm.api.User;
import com.sessionm.core.Drawables;
import com.sessionm.core.Session;
import java.util.Locale;

// Referenced classes of package com.sessionm.ui:
//            ButtonManager, BadgeView

public class PortalButton extends FrameLayout
    implements SessionListener
{

    private static final String TAG = "SessionM.PortalButton";
    private BadgeView badge;
    private int badgePosition;
    private ImageButton button;
    private BitmapDrawable enabledDrawable;
    private int resourceId;
    private boolean shouldShowBadge;
    private boolean useDefaultImages;

    protected PortalButton(Context context)
    {
        super(context);
        useDefaultImages = true;
        enabledDrawable = null;
        shouldShowBadge = true;
        resourceId = 0;
        badgePosition = 2;
        button = new ImageButton(getContext(), null);
        setupButton(context);
    }

    protected PortalButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        useDefaultImages = true;
        enabledDrawable = null;
        shouldShowBadge = true;
        resourceId = 0;
        badgePosition = 2;
        setupButton(context, attributeset);
    }

    private void setupButton(Context context)
    {
        if (SessionM.getInstance().getSessionListener() == null)
        {
            SessionM.getInstance().setSessionListener(this);
        }
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final PortalButton this$0;

            public void onClick(View view)
            {
                ButtonManager.getInstance().buttonPressed();
                view = Session.D().E();
                view = String.format(Locale.US, "apps/%s/portal?origin=portal_button&z=%d", new Object[] {
                    view, Long.valueOf(System.currentTimeMillis())
                });
                Session.D().b(new Activity(com.sessionm.api.SessionM.ActivityType.PORTAL), new Object[] {
                    view
                });
            }

            
            {
                this$0 = PortalButton.this;
                super();
            }
        });
        if (isInEditMode())
        {
            return;
        } else
        {
            ButtonManager.getInstance().registerButton(this);
            enabledDrawable = Drawables.aH.e(context);
            (new Handler(getContext().getMainLooper())).post(new Runnable() {

                final PortalButton this$0;

                public void run()
                {
                    addView(button, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    updateButton();
                }

            
            {
                this$0 = PortalButton.this;
                super();
            }
            });
            return;
        }
    }

    private void setupButton(Context context, AttributeSet attributeset)
    {
        button = new ImageButton(getContext(), attributeset);
        setupButton(context);
    }

    private void showBadge()
    {
        badge.setBadgePosition(badgePosition);
        badge.setBadgeMargin(0, -3);
        TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, 8F);
        translateanimation.setRepeatMode(2);
        translateanimation.setInterpolator(new BounceInterpolator());
        translateanimation.setFillAfter(true);
        translateanimation.setDuration(400L);
        badge.show(translateanimation);
    }

    private void updateButtonImage()
    {
        button.setBackgroundResource(0);
        button.setImageBitmap(null);
        if (useDefaultImages)
        {
            button.setImageDrawable(enabledDrawable);
            return;
        } else
        {
            button.setBackgroundResource(resourceId);
            return;
        }
    }

    private void updateLabelWithState(ButtonManager.LabelState labelstate)
    {
        if (badge == null)
        {
            badge = new BadgeView(getContext(), button);
        }
        if (button == null || getParent() == null || button.getParent() == null || !shouldShowBadge)
        {
            badge.setText(null);
            badge.hide();
        } else
        if (labelstate.equals(ButtonManager.LabelState.LABEL_STATE_NORMAL))
        {
            int i = Session.D().C().getUnclaimedAchievementCount();
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
        }
    }

    protected int getBadgePosition()
    {
        return badgePosition;
    }

    protected ImageButton getButton()
    {
        return button;
    }

    protected int getResourceId()
    {
        return resourceId;
    }

    protected void onDisplayHint(int i)
    {
        updateButton();
    }

    public void onSessionFailed(SessionM sessionm, int i)
    {
    }

    public void onSessionStateChanged(SessionM sessionm, com.sessionm.api.SessionM.State state)
    {
        if (state == com.sessionm.api.SessionM.State.STARTED_ONLINE || SessionM.getInstance().getUser().isOptedOut() && state != com.sessionm.api.SessionM.State.STARTED_OFFLINE)
        {
            if (Log.isLoggable("SessionM.PortalButton", 3))
            {
                Log.d("SessionM.PortalButton", "Portal button enabled.");
            }
            setEnabled(true);
            return;
        }
        if (Log.isLoggable("SessionM.PortalButton", 3))
        {
            Log.d("SessionM.PortalButton", "Portal button disabled.");
        }
        setEnabled(false);
    }

    public void onUnclaimedAchievement(SessionM sessionm, AchievementData achievementdata)
    {
    }

    public void onUserUpdated(SessionM sessionm, User user)
    {
        if (SessionM.getInstance().getSessionState() != com.sessionm.api.SessionM.State.STARTED_OFFLINE && user.isOptedOut() || SessionM.getInstance().getSessionState() == com.sessionm.api.SessionM.State.STARTED_ONLINE)
        {
            if (Log.isLoggable("SessionM.PortalButton", 3))
            {
                Log.d("SessionM.PortalButton", "Portal button enabled.");
            }
            setEnabled(true);
            return;
        }
        if (Log.isLoggable("SessionM.PortalButton", 3))
        {
            Log.d("SessionM.PortalButton", "Portal button disabled.");
        }
        setEnabled(false);
    }

    protected void setBadgePosition(int i)
    {
        badgePosition = i;
        updateButton();
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        if (badge != null)
        {
            setShouldShowBadge(flag);
        }
        if (button != null)
        {
            button.setEnabled(flag);
        }
    }

    protected void setResourceId(int i)
    {
        useDefaultImages = false;
        resourceId = i;
        updateButtonImage();
    }

    protected void setShouldShowBadge(boolean flag)
    {
        shouldShowBadge = flag;
        updateButton();
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
        if (button != null)
        {
            button.setVisibility(i);
        }
        if (badge != null)
        {
            badge.setVisibility(i);
        }
    }

    protected boolean shouldShowBadge()
    {
        return shouldShowBadge;
    }

    void updateButton()
    {
        final ButtonManager.LabelState state = ButtonManager.getInstance().getLabelState();
        (new Handler(getContext().getMainLooper())).post(new Runnable() {

            final PortalButton this$0;
            final ButtonManager.LabelState val$state;

            public void run()
            {
                updateButtonImage();
                updateLabelWithState(state);
            }

            
            {
                this$0 = PortalButton.this;
                state = labelstate;
                super();
            }
        });
    }



}
