.class final Lcom/google/android/gms/internal/zzjb$zzd;
.super Lcom/google/android/gms/common/api/zzc;

# interfaces
.implements Lcom/google/android/gms/appstate/AppStateManager$StateListResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzjb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "zzd"
.end annotation


# instance fields
.field private final zzOv:Lcom/google/android/gms/appstate/AppStateBuffer;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/zzc;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v0, Lcom/google/android/gms/appstate/AppStateBuffer;

    invoke-direct {v0, p1}, Lcom/google/android/gms/appstate/AppStateBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzjb$zzd;->zzOv:Lcom/google/android/gms/appstate/AppStateBuffer;

    return-void
.end method


# virtual methods
.method public getStateBuffer()Lcom/google/android/gms/appstate/AppStateBuffer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzjb$zzd;->zzOv:Lcom/google/android/gms/appstate/AppStateBuffer;

    return-object v0
.end method
