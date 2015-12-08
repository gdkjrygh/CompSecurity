.class interface abstract Lcom/google/android/gms/common/api/zzg$zze;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/api/zzg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "zze"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lcom/google/android/gms/common/api/Api$Client;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract cancel()V
.end method

.method public abstract forceFailureUnlessReady(Lcom/google/android/gms/common/api/Status;)V
.end method

.method public abstract zza(Lcom/google/android/gms/common/api/zzg$zzc;)V
.end method

.method public abstract zzb(Lcom/google/android/gms/common/api/Api$Client;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/DeadObjectException;
        }
    .end annotation
.end method

.method public abstract zzms()Lcom/google/android/gms/common/api/Api$ClientKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/Api$ClientKey",
            "<TA;>;"
        }
    .end annotation
.end method

.method public abstract zzmv()I
.end method

.method public abstract zzr(Lcom/google/android/gms/common/api/Status;)V
.end method
