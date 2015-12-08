// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness;

import com.google.android.gms.common.api.Scope;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class zza
{

    public static Scope zzb(Scope scope)
    {
        Scope scope1;
        if (scope.equals(new Scope("https://www.googleapis.com/auth/fitness.activity.read")))
        {
            scope1 = new Scope("https://www.googleapis.com/auth/fitness.activity.write");
        } else
        {
            if (scope.equals(new Scope("https://www.googleapis.com/auth/fitness.location.read")))
            {
                return new Scope("https://www.googleapis.com/auth/fitness.location.write");
            }
            if (scope.equals(new Scope("https://www.googleapis.com/auth/fitness.body.read")))
            {
                return new Scope("https://www.googleapis.com/auth/fitness.body.write");
            }
            scope1 = scope;
            if (scope.equals(new Scope("https://www.googleapis.com/auth/fitness.nutrition.read")))
            {
                return new Scope("https://www.googleapis.com/auth/fitness.nutrition.write");
            }
        }
        return scope1;
    }

    public static Set zzd(Set set)
    {
        HashSet hashset = new HashSet(set.size());
        Iterator iterator = set.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Scope scope = (Scope)iterator.next();
            Scope scope1 = zzb(scope);
            if (scope1.equals(scope) || !set.contains(scope1))
            {
                hashset.add(scope);
            }
        } while (true);
        return hashset;
    }
}
