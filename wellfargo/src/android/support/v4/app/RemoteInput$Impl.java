// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            RemoteInput

interface 
{

    public abstract void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle);

    public abstract Bundle getResultsFromIntent(Intent intent);
}
