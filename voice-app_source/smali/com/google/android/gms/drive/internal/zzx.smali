.class public final Lcom/google/android/gms/drive/internal/zzx;
.super Ljava/lang/Object;


# static fields
.field private static final zzaft:Lcom/google/android/gms/common/internal/zzn;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/internal/zzn;

    const-string v1, "GmsDrive"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/internal/zzn;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/drive/internal/zzx;->zzaft:Lcom/google/android/gms/common/internal/zzn;

    return-void
.end method

.method public static zza(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/zzx;->zzaft:Lcom/google/android/gms/common/internal/zzn;

    invoke-virtual {v0, p0, p2, p1}, Lcom/google/android/gms/common/internal/zzn;->zzc(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static zze(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/drive/internal/zzx;->zzaft:Lcom/google/android/gms/common/internal/zzn;

    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0, p0, p1, p2, v1}, Lcom/google/android/gms/common/internal/zzn;->zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static zzt(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/zzx;->zzaft:Lcom/google/android/gms/common/internal/zzn;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/common/internal/zzn;->zzt(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static zzu(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/zzx;->zzaft:Lcom/google/android/gms/common/internal/zzn;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/common/internal/zzn;->zzu(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static zzv(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/zzx;->zzaft:Lcom/google/android/gms/common/internal/zzn;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/common/internal/zzn;->zzv(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
