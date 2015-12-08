// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.share;


// Referenced classes of package com.weather.commons.share:
//            ShareableMessage

public interface ShareMessageSupport
{

    public abstract void fireBeacon(ShareableMessage shareablemessage);

    public abstract CharSequence getChooserTitle();

    public abstract CharSequence getHtmlMessage(ShareableMessage shareablemessage);

    public abstract CharSequence getMessage(ShareableMessage shareablemessage);

    public abstract CharSequence getSubject(ShareableMessage shareablemessage);

    public abstract CharSequence getTwitterBody(ShareableMessage shareablemessage);
}
