// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import com.sessionm.api.AchievementData;
import com.sessionm.api.SessionListener;
import com.sessionm.api.SessionM;
import com.sessionm.api.User;
import com.sessionm.core.Session;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.sessionm.ui:
//            PortalButton

public class ButtonManager
    implements SessionListener
{
    public static final class LabelState extends Enum
    {

        private static final LabelState $VALUES[];
        public static final LabelState LABEL_STATE_HIDDEN;
        public static final LabelState LABEL_STATE_NORMAL;

        public static LabelState valueOf(String s)
        {
            return (LabelState)Enum.valueOf(com/sessionm/ui/ButtonManager$LabelState, s);
        }

        public static LabelState[] values()
        {
            return (LabelState[])$VALUES.clone();
        }

        static 
        {
            LABEL_STATE_NORMAL = new LabelState("LABEL_STATE_NORMAL", 0);
            LABEL_STATE_HIDDEN = new LabelState("LABEL_STATE_HIDDEN", 1);
            $VALUES = (new LabelState[] {
                LABEL_STATE_NORMAL, LABEL_STATE_HIDDEN
            });
        }

        private LabelState(String s, int i)
        {
            super(s, i);
        }
    }


    private static ButtonManager instance;
    private Set buttons;
    private LabelState labelState;

    private ButtonManager()
    {
        labelState = LabelState.LABEL_STATE_HIDDEN;
        buttons = new HashSet();
        Session session = Session.D();
        setLabelState(LabelState.LABEL_STATE_HIDDEN);
        session.a(this);
    }

    public static ButtonManager getInstance()
    {
        com/sessionm/ui/ButtonManager;
        JVM INSTR monitorenter ;
        ButtonManager buttonmanager;
        if (instance == null)
        {
            instance = new ButtonManager();
        }
        buttonmanager = instance;
        com/sessionm/ui/ButtonManager;
        JVM INSTR monitorexit ;
        return buttonmanager;
        Exception exception;
        exception;
        throw exception;
    }

    private void notifyPortalButtons()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator;
        setLabelStateWithUser(SessionM.getInstance().getUser());
        iterator = buttons.iterator();
_L2:
        WeakReference weakreference;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_75;
            }
            weakreference = (WeakReference)iterator.next();
            if (weakreference.get() != null)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            iterator.remove();
        } while (true);
        Exception exception;
        exception;
        throw exception;
        ((PortalButton)weakreference.get()).updateButton();
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
    }

    public static void reset()
    {
        getInstance().setLabelState(LabelState.LABEL_STATE_HIDDEN);
    }

    private void setLabelState(LabelState labelstate)
    {
        labelState = labelstate;
    }

    private void setLabelStateWithUser(User user)
    {
        if (user != null && user.getUnclaimedAchievementCount() > 0)
        {
            setLabelState(LabelState.LABEL_STATE_NORMAL);
            return;
        } else
        {
            setLabelState(LabelState.LABEL_STATE_HIDDEN);
            return;
        }
    }

    public void buttonPressed()
    {
        setLabelStateWithUser(Session.D().C());
        notifyPortalButtons();
    }

    public Set getButtons()
    {
        return buttons;
    }

    public LabelState getLabelState()
    {
        return labelState;
    }

    public void onSessionFailed(SessionM sessionm, int i)
    {
    }

    public void onSessionStateChanged(SessionM sessionm, com.sessionm.api.SessionM.State state)
    {
        notifyPortalButtons();
    }

    public void onUnclaimedAchievement(SessionM sessionm, AchievementData achievementdata)
    {
    }

    public void onUserUpdated(SessionM sessionm, User user)
    {
        notifyPortalButtons();
    }

    void registerButton(PortalButton portalbutton)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = buttons.contains(portalbutton);
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        buttons.add(new WeakReference(portalbutton));
        if (true) goto _L1; else goto _L3
_L3:
        portalbutton;
        throw portalbutton;
    }
}
