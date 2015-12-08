// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.Payments;

// Referenced classes of package com.google.android.gms.internal:
//            zzqx

public class zzqw
    implements Payments
{

    public zzqw()
    {
    }

    public void changeMaskedWallet(GoogleApiClient googleapiclient, String s, String s1, int i)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, s, s1, i) {

            final zzqw zzaSo;
            final String zzaSr;
            final String zzaSs;
            final int zzaww;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzqx)client);
            }

            protected void zza(zzqx zzqx1)
            {
                zzqx1.zze(zzaSr, zzaSs, zzaww);
                setResult(Status.zzXP);
            }

            
            {
                zzaSo = zzqw.this;
                zzaSr = s;
                zzaSs = s1;
                zzaww = i;
                super(googleapiclient);
            }
        });
    }

    public void checkForPreAuthorization(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, i) {

            final zzqw zzaSo;
            final int zzaww;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzqx)client);
            }

            protected void zza(zzqx zzqx1)
            {
                zzqx1.zzjB(zzaww);
                setResult(Status.zzXP);
            }

            
            {
                zzaSo = zzqw.this;
                zzaww = i;
                super(googleapiclient);
            }
        });
    }

    public void isNewUser(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, i) {

            final zzqw zzaSo;
            final int zzaww;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzqx)client);
            }

            protected void zza(zzqx zzqx1)
            {
                zzqx1.zzjC(zzaww);
                setResult(Status.zzXP);
            }

            
            {
                zzaSo = zzqw.this;
                zzaww = i;
                super(googleapiclient);
            }
        });
    }

    public void loadFullWallet(GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, fullwalletrequest, i) {

            final zzqw zzaSo;
            final FullWalletRequest zzaSq;
            final int zzaww;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzqx)client);
            }

            protected void zza(zzqx zzqx1)
            {
                zzqx1.zza(zzaSq, zzaww);
                setResult(Status.zzXP);
            }

            
            {
                zzaSo = zzqw.this;
                zzaSq = fullwalletrequest;
                zzaww = i;
                super(googleapiclient);
            }
        });
    }

    public void loadMaskedWallet(GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, maskedwalletrequest, i) {

            final zzqw zzaSo;
            final MaskedWalletRequest zzaSp;
            final int zzaww;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzqx)client);
            }

            protected void zza(zzqx zzqx1)
            {
                zzqx1.zza(zzaSp, zzaww);
                setResult(Status.zzXP);
            }

            
            {
                zzaSo = zzqw.this;
                zzaSp = maskedwalletrequest;
                zzaww = i;
                super(googleapiclient);
            }
        });
    }

    public void notifyTransactionStatus(GoogleApiClient googleapiclient, NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, notifytransactionstatusrequest) {

            final zzqw zzaSo;
            final NotifyTransactionStatusRequest zzaSt;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzqx)client);
            }

            protected void zza(zzqx zzqx1)
            {
                zzqx1.zza(zzaSt);
                setResult(Status.zzXP);
            }

            
            {
                zzaSo = zzqw.this;
                zzaSt = notifytransactionstatusrequest;
                super(googleapiclient);
            }
        });
    }
}
