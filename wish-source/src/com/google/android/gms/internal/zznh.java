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
//            zzni

public class zznh
    implements Payments
{

    public zznh()
    {
    }

    public void changeMaskedWallet(GoogleApiClient googleapiclient, String s, String s1, int i)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, s, s1, i) {

            final zznh zzaKf;
            final String zzaKi;
            final String zzaKj;
            final int zzapk;

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzni)zza1);
            }

            protected void zza(zzni zzni1)
            {
                zzni1.zze(zzaKi, zzaKj, zzapk);
                setResult(Status.zzQU);
            }

            
            {
                zzaKf = zznh.this;
                zzaKi = s;
                zzaKj = s1;
                zzapk = i;
                super(googleapiclient);
            }
        });
    }

    public void checkForPreAuthorization(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, i) {

            final zznh zzaKf;
            final int zzapk;

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzni)zza1);
            }

            protected void zza(zzni zzni1)
            {
                zzni1.zzim(zzapk);
                setResult(Status.zzQU);
            }

            
            {
                zzaKf = zznh.this;
                zzapk = i;
                super(googleapiclient);
            }
        });
    }

    public void loadFullWallet(GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, fullwalletrequest, i) {

            final zznh zzaKf;
            final FullWalletRequest zzaKh;
            final int zzapk;

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzni)zza1);
            }

            protected void zza(zzni zzni1)
            {
                zzni1.zza(zzaKh, zzapk);
                setResult(Status.zzQU);
            }

            
            {
                zzaKf = zznh.this;
                zzaKh = fullwalletrequest;
                zzapk = i;
                super(googleapiclient);
            }
        });
    }

    public void loadMaskedWallet(GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, maskedwalletrequest, i) {

            final zznh zzaKf;
            final MaskedWalletRequest zzaKg;
            final int zzapk;

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzni)zza1);
            }

            protected void zza(zzni zzni1)
            {
                zzni1.zza(zzaKg, zzapk);
                setResult(Status.zzQU);
            }

            
            {
                zzaKf = zznh.this;
                zzaKg = maskedwalletrequest;
                zzapk = i;
                super(googleapiclient);
            }
        });
    }

    public void notifyTransactionStatus(GoogleApiClient googleapiclient, NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        googleapiclient.zza(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, notifytransactionstatusrequest) {

            final zznh zzaKf;
            final NotifyTransactionStatusRequest zzaKk;

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzni)zza1);
            }

            protected void zza(zzni zzni1)
            {
                zzni1.zza(zzaKk);
                setResult(Status.zzQU);
            }

            
            {
                zzaKf = zznh.this;
                zzaKk = notifytransactionstatusrequest;
                super(googleapiclient);
            }
        });
    }
}
