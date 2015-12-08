// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui.fragment;


// Referenced classes of package com.sessionm.ui.fragment:
//            BaseFragment

static final class  extends Enum
{

    private static final DETACHED $VALUES[];
    public static final DETACHED ATTACHED;
    public static final DETACHED CREATED;
    public static final DETACHED CREATED_VIEW;
    public static final DETACHED DESTROYED;
    public static final DETACHED DESTROYED_VIEW;
    public static final DETACHED DETACHED;
    public static final DETACHED PAUSED;
    public static final DETACHED RESUMED;
    public static final DETACHED STARTED;
    public static final DETACHED STOPPED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/ui/fragment/BaseFragment$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public boolean isViewAvailable()
    {
        return ordinal() > CREATED.ordinal() && ordinal() < DESTROYED_VIEW.ordinal();
    }

    static 
    {
        ATTACHED = new <init>("ATTACHED", 0);
        CREATED = new <init>("CREATED", 1);
        CREATED_VIEW = new <init>("CREATED_VIEW", 2);
        STARTED = new <init>("STARTED", 3);
        RESUMED = new <init>("RESUMED", 4);
        PAUSED = new <init>("PAUSED", 5);
        STOPPED = new <init>("STOPPED", 6);
        DESTROYED_VIEW = new <init>("DESTROYED_VIEW", 7);
        DESTROYED = new <init>("DESTROYED", 8);
        DETACHED = new <init>("DETACHED", 9);
        $VALUES = (new .VALUES[] {
            ATTACHED, CREATED, CREATED_VIEW, STARTED, RESUMED, PAUSED, STOPPED, DESTROYED_VIEW, DESTROYED, DETACHED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
