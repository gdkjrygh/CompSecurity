// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.prompt;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.user.UserPreferences;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.prompt:
//            Prompt, RateAppPrompt

public class PromptManager
{

    private static PromptManager _instance = new PromptManager();
    private ArrayList registeredPrompts;

    private PromptManager()
    {
        registeredPrompts = new ArrayList();
        registerPrompts();
        initializePrompts();
    }

    public static PromptManager getInstance()
    {
        return _instance;
    }

    private void initializePrompts()
    {
        long l = UserPreferences.getAppForegroundCount();
        for (Iterator iterator = registeredPrompts.iterator(); iterator.hasNext(); ((Prompt)iterator.next()).initialize(l)) { }
    }

    private void registerPrompts()
    {
        registeredPrompts.add(new RateAppPrompt());
    }

    public void deactivateNewUserPrompts()
    {
    }

    public void loggedInAppForegrounded()
    {
        long l = UserPreferences.getAppForegroundCount() + 1L;
        UserPreferences.setAppForegroundCount(l);
        for (Iterator iterator = registeredPrompts.iterator(); iterator.hasNext(); ((Prompt)iterator.next()).onLoggedInAppForeground(l)) { }
    }

    public boolean showAvailablePrompts(RootActivity rootactivity)
    {
        return showAvailablePrompts(rootactivity, 1);
    }

    public boolean showAvailablePrompts(RootActivity rootactivity, int i)
    {
        if (!WishApplication.getAppInstance().isScreenshotBuild())
        {
            int j = 0;
            long l = UserPreferences.getAppForegroundCount();
            Iterator iterator = registeredPrompts.iterator();
            int k;
label0:
            do
            {
                do
                {
                    k = j;
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    Prompt prompt = (Prompt)iterator.next();
                    k = j;
                    if (prompt.canShowPrompt(l))
                    {
                        prompt.showPrompt(rootactivity, l);
                        k = j + 1;
                    }
                    j = k;
                } while (i == -1);
                j = k;
            } while (k < i);
            if (k > 0)
            {
                return true;
            }
        }
        return false;
    }

}
