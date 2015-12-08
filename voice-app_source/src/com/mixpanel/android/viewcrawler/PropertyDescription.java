// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;


// Referenced classes of package com.mixpanel.android.viewcrawler:
//            Caller

class PropertyDescription
{

    public final Caller accessor;
    private final String mMutatorName;
    public final String name;
    public final Class targetClass;

    public PropertyDescription(String s, Class class1, Caller caller, String s1)
    {
        name = s;
        targetClass = class1;
        accessor = caller;
        mMutatorName = s1;
    }

    public Caller makeMutator(Object aobj[])
        throws NoSuchMethodException
    {
        if (mMutatorName == null)
        {
            return null;
        } else
        {
            return new Caller(targetClass, mMutatorName, aobj, Void.TYPE);
        }
    }

    public String toString()
    {
        return (new StringBuilder("[PropertyDescription ")).append(name).append(",").append(targetClass).append(", ").append(accessor).append("/").append(mMutatorName).append("]").toString();
    }
}
