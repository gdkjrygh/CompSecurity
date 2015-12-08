// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzu;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public static interface CheckResult.zzWJ
{
    public static class CheckResult
    {

        private boolean zzWI;
        private Set zzWJ;

        public static CheckResult newAuthNotRequiredResult()
        {
            return new CheckResult(false, null);
        }

        public static CheckResult newAuthRequiredResult(Set set)
        {
            boolean flag;
            if (set != null && !set.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "A non-empty scope set is required if further auth is needed.");
            return new CheckResult(true, set);
        }

        public boolean zzmA()
        {
            return zzWI;
        }

        public Set zzmB()
        {
            return zzWJ;
        }

        private CheckResult(boolean flag, Set set)
        {
            zzWI = flag;
            zzWJ = set;
        }
    }


    public abstract CheckResult onCheckServerAuthorization(String s, Set set);

    public abstract boolean onUploadServerAuthCode(String s, String s1);
}
