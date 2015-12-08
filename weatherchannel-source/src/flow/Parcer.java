// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package flow;

import android.os.Parcelable;

public interface Parcer
{

    public abstract Object unwrap(Parcelable parcelable);

    public abstract Parcelable wrap(Object obj);
}
