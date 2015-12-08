// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.navigation;


// Referenced classes of package io.theholygrail.dingo.navigation:
//            ExternalUrlOptions, NavigationOptions

public interface NavigationBridgeCallback
{
    public static interface OnBackListener
    {

        public abstract void onBack();
    }


    public abstract void animateBackwards();

    public abstract void animateForward(String s);

    public abstract void dismissModal();

    public abstract void popToRoot();

    public abstract void presentExternalUrl(ExternalUrlOptions externalurloptions);

    public abstract void presentModal(NavigationOptions navigationoptions);

    public abstract void setOnBackListener(OnBackListener onbacklistener);
}
