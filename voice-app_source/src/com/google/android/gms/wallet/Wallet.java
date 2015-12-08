// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqx;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.internal.zzra;
import com.google.android.gms.wallet.firstparty.zza;
import com.google.android.gms.wallet.wobs.zzj;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.wallet:
//            Payments, FullWalletRequest, MaskedWalletRequest, NotifyTransactionStatusRequest

public final class Wallet
{
    public static final class WalletOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
    {

        public final int environment;
        public final int theme;

        private WalletOptions()
        {
            this(new Builder());
        }


        private WalletOptions(Builder builder)
        {
            environment = com.google.android.gms.wallet.Builder.zza(builder);
            theme = Builder.zzb(builder);
        }

    }

    public static final class WalletOptions.Builder
    {

        private int mTheme;
        private int zzaRH;

        static int zza(WalletOptions.Builder builder)
        {
            return builder.zzaRH;
        }

        static int zzb(WalletOptions.Builder builder)
        {
            return builder.mTheme;
        }

        public WalletOptions build()
        {
            return new WalletOptions(this);
        }

        public WalletOptions.Builder setEnvironment(int i)
        {
            if (i == 0 || i == 2 || i == 1 || i == 3)
            {
                zzaRH = i;
                return this;
            } else
            {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[] {
                    Integer.valueOf(i)
                }));
            }
        }

        public WalletOptions.Builder setTheme(int i)
        {
            if (i == 0 || i == 1)
            {
                mTheme = i;
                return this;
            } else
            {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", new Object[] {
                    Integer.valueOf(i)
                }));
            }
        }

        public WalletOptions.Builder()
        {
            zzaRH = 3;
            mTheme = 0;
        }
    }

    public static abstract class zza extends com.google.android.gms.common.api.zza.zza
    {

        public zza(GoogleApiClient googleapiclient)
        {
            super(Wallet.zzAK(), googleapiclient);
        }
    }

    public static abstract class zzb extends zza
    {

        protected Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected Status zzb(Status status)
        {
            return status;
        }

        public zzb(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public static final Api API;
    public static final Payments Payments = new zzqw();
    private static final com.google.android.gms.common.api.Api.ClientKey zzNX;
    private static final com.google.android.gms.common.api.Api.zza zzNY;
    public static final zzj zzaRF = new zzra();
    public static final com.google.android.gms.wallet.firstparty.zza zzaRG = new zzqz();

    private Wallet()
    {
    }

    public static void changeMaskedWallet(GoogleApiClient googleapiclient, String s, String s1, int i)
    {
        Payments.changeMaskedWallet(googleapiclient, s, s1, i);
    }

    public static void checkForPreAuthorization(GoogleApiClient googleapiclient, int i)
    {
        Payments.checkForPreAuthorization(googleapiclient, i);
    }

    public static void loadFullWallet(GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i)
    {
        Payments.loadFullWallet(googleapiclient, fullwalletrequest, i);
    }

    public static void loadMaskedWallet(GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i)
    {
        Payments.loadMaskedWallet(googleapiclient, maskedwalletrequest, i);
    }

    public static void notifyTransactionStatus(GoogleApiClient googleapiclient, NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        Payments.notifyTransactionStatus(googleapiclient, notifytransactionstatusrequest);
    }

    static com.google.android.gms.common.api.Api.ClientKey zzAK()
    {
        return zzNX;
    }

    static 
    {
        zzNX = new com.google.android.gms.common.api.Api.ClientKey();
        zzNY = new com.google.android.gms.common.api.Api.zza() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public volatile com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zze1, (WalletOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzqx zza(Context context, Looper looper, zze zze1, WalletOptions walletoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                zzu.zzb(context instanceof Activity, "An Activity must be used for Wallet APIs");
                context = (Activity)context;
                if (walletoptions == null)
                {
                    walletoptions = new WalletOptions();
                }
                return new zzqx(context, looper, connectioncallbacks, onconnectionfailedlistener, walletoptions.environment, zze1.getAccountName(), walletoptions.theme);
            }

        };
        API = new Api("Wallet.API", zzNY, zzNX, new Scope[0]);
    }
}
