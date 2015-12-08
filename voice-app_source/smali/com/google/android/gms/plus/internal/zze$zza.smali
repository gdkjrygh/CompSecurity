.class final Lcom/google/android/gms/plus/internal/zze$zza;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/plus/Moments$LoadMomentsResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/plus/internal/zze;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "zza"
.end annotation


# instance fields
.field private final zzOt:Lcom/google/android/gms/common/api/Status;

.field private final zzaHn:Ljava/lang/String;

.field private final zzaHo:Ljava/lang/String;

.field private final zzaHp:Lcom/google/android/gms/plus/model/moments/MomentBuffer;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/plus/internal/zze$zza;->zzOt:Lcom/google/android/gms/common/api/Status;

    iput-object p3, p0, Lcom/google/android/gms/plus/internal/zze$zza;->zzaHn:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/plus/internal/zze$zza;->zzaHo:Ljava/lang/String;

    if-eqz p2, :cond_0

    new-instance v0, Lcom/google/android/gms/plus/model/moments/MomentBuffer;

    invoke-direct {v0, p2}, Lcom/google/android/gms/plus/model/moments/MomentBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/plus/internal/zze$zza;->zzaHp:Lcom/google/android/gms/plus/model/moments/MomentBuffer;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public getMomentBuffer()Lcom/google/android/gms/plus/model/moments/MomentBuffer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/zze$zza;->zzaHp:Lcom/google/android/gms/plus/model/moments/MomentBuffer;

    return-object v0
.end method

.method public getNextPageToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/zze$zza;->zzaHn:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/zze$zza;->zzOt:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public getUpdated()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/zze$zza;->zzaHo:Ljava/lang/String;

    return-object v0
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/zze$zza;->zzaHp:Lcom/google/android/gms/plus/model/moments/MomentBuffer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/zze$zza;->zzaHp:Lcom/google/android/gms/plus/model/moments/MomentBuffer;

    invoke-virtual {v0}, Lcom/google/android/gms/plus/model/moments/MomentBuffer;->release()V

    :cond_0
    return-void
.end method
