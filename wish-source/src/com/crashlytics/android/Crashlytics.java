// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.crashlytics.android.core.CrashlyticsListener;
import com.crashlytics.android.core.PinningInfoProvider;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.KitGroup;
import io.fabric.sdk.android.Logger;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Crashlytics extends Kit
    implements KitGroup
{
    public static class Builder
    {

        private Answers answers;
        private Beta beta;
        private CrashlyticsCore core;
        private com.crashlytics.android.core.CrashlyticsCore.Builder coreBuilder;

        private com.crashlytics.android.core.CrashlyticsCore.Builder getCoreBuilder()
        {
            this;
            JVM INSTR monitorenter ;
            com.crashlytics.android.core.CrashlyticsCore.Builder builder;
            if (coreBuilder == null)
            {
                coreBuilder = new com.crashlytics.android.core.CrashlyticsCore.Builder();
            }
            builder = coreBuilder;
            this;
            JVM INSTR monitorexit ;
            return builder;
            Exception exception;
            exception;
            throw exception;
        }

        public Builder answers(Answers answers1)
        {
            if (answers1 == null)
            {
                throw new NullPointerException("Answers Kit must not be null.");
            }
            if (answers != null)
            {
                throw new IllegalStateException("Answers Kit already set.");
            } else
            {
                answers = answers1;
                return this;
            }
        }

        public Builder beta(Beta beta1)
        {
            if (beta1 == null)
            {
                throw new NullPointerException("Beta Kit must not be null.");
            }
            if (beta != null)
            {
                throw new IllegalStateException("Beta Kit already set.");
            } else
            {
                beta = beta1;
                return this;
            }
        }

        public Crashlytics build()
        {
            if (coreBuilder != null)
            {
                if (core != null)
                {
                    throw new IllegalStateException("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
                }
                core = coreBuilder.build();
            }
            if (answers == null)
            {
                answers = new Answers();
            }
            if (beta == null)
            {
                beta = new Beta();
            }
            if (core == null)
            {
                core = new CrashlyticsCore();
            }
            return new Crashlytics(answers, beta, core);
        }

        public Builder core(CrashlyticsCore crashlyticscore)
        {
            if (crashlyticscore == null)
            {
                throw new NullPointerException("CrashlyticsCore Kit must not be null.");
            }
            if (core != null)
            {
                throw new IllegalStateException("CrashlyticsCore Kit already set.");
            } else
            {
                core = crashlyticscore;
                return this;
            }
        }

        public Builder delay(float f)
        {
            getCoreBuilder().delay(f);
            return this;
        }

        public Builder disabled(boolean flag)
        {
            getCoreBuilder().disabled(flag);
            return this;
        }

        public Builder listener(CrashlyticsListener crashlyticslistener)
        {
            getCoreBuilder().listener(crashlyticslistener);
            return this;
        }

        public Builder pinningInfo(PinningInfoProvider pinninginfoprovider)
        {
            getCoreBuilder().pinningInfo(pinninginfoprovider);
            return this;
        }

        public Builder()
        {
        }
    }


    public static final String TAG = "Crashlytics";
    public final Answers answers;
    public final Beta beta;
    public final CrashlyticsCore core;
    public final Collection kits;

    public Crashlytics()
    {
        this(new Answers(), new Beta(), new CrashlyticsCore());
    }

    Crashlytics(Answers answers1, Beta beta1, CrashlyticsCore crashlyticscore)
    {
        answers = answers1;
        beta = beta1;
        core = crashlyticscore;
        kits = Collections.unmodifiableCollection(Arrays.asList(new Kit[] {
            answers1, beta1, crashlyticscore
        }));
    }

    private static void checkInitialized()
    {
        if (getInstance() == null)
        {
            throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
        } else
        {
            return;
        }
    }

    public static Crashlytics getInstance()
    {
        return (Crashlytics)Fabric.getKit(com/crashlytics/android/Crashlytics);
    }

    public static PinningInfoProvider getPinningInfoProvider()
    {
        checkInitialized();
        return getInstance().core.getPinningInfoProvider();
    }

    public static void log(int i, String s, String s1)
    {
        checkInitialized();
        getInstance().core.log(i, s, s1);
    }

    public static void log(String s)
    {
        checkInitialized();
        getInstance().core.log(s);
    }

    public static void logException(Throwable throwable)
    {
        checkInitialized();
        getInstance().core.logException(throwable);
    }

    public static void setBool(String s, boolean flag)
    {
        checkInitialized();
        getInstance().core.setBool(s, flag);
    }

    public static void setDouble(String s, double d)
    {
        checkInitialized();
        getInstance().core.setDouble(s, d);
    }

    public static void setFloat(String s, float f)
    {
        checkInitialized();
        getInstance().core.setFloat(s, f);
    }

    public static void setInt(String s, int i)
    {
        checkInitialized();
        getInstance().core.setInt(s, i);
    }

    public static void setLong(String s, long l)
    {
        checkInitialized();
        getInstance().core.setLong(s, l);
    }

    public static void setPinningInfoProvider(PinningInfoProvider pinninginfoprovider)
    {
        Fabric.getLogger().w("Crashlytics", "Use of Crashlytics.setPinningInfoProvider is deprecated");
    }

    public static void setString(String s, String s1)
    {
        checkInitialized();
        getInstance().core.setString(s, s1);
    }

    public static void setUserEmail(String s)
    {
        checkInitialized();
        getInstance().core.setUserEmail(s);
    }

    public static void setUserIdentifier(String s)
    {
        checkInitialized();
        getInstance().core.setUserIdentifier(s);
    }

    public static void setUserName(String s)
    {
        checkInitialized();
        getInstance().core.setUserName(s);
    }

    public void crash()
    {
        core.crash();
    }

    protected volatile Object doInBackground()
    {
        return doInBackground();
    }

    protected Void doInBackground()
    {
        return null;
    }

    public boolean getDebugMode()
    {
        Fabric.getLogger().w("Crashlytics", "Use of Crashlytics.getDebugMode is deprecated.");
        getFabric();
        return Fabric.isDebuggable();
    }

    public String getIdentifier()
    {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public Collection getKits()
    {
        return kits;
    }

    public String getVersion()
    {
        return "2.5.2.79";
    }

    public void setDebugMode(boolean flag)
    {
        Fabric.getLogger().w("Crashlytics", "Use of Crashlytics.setDebugMode is deprecated.");
    }

    public void setListener(CrashlyticsListener crashlyticslistener)
    {
        this;
        JVM INSTR monitorenter ;
        core.setListener(crashlyticslistener);
        this;
        JVM INSTR monitorexit ;
        return;
        crashlyticslistener;
        throw crashlyticslistener;
    }

    public boolean verifyPinning(URL url)
    {
        return core.verifyPinning(url);
    }
}
