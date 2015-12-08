.class final Lcom/google/android/gms/internal/zzjs$zzd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerInstanceResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzjs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "zzd"
.end annotation


# instance fields
.field private final zzOt:Lcom/google/android/gms/common/api/Status;

.field private final zzTJ:Lcom/google/android/gms/cast/games/GameManagerClient;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/cast/games/GameManagerClient;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzjs$zzd;->zzOt:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzjs$zzd;->zzTJ:Lcom/google/android/gms/cast/games/GameManagerClient;

    return-void
.end method


# virtual methods
.method public getGameManagerClient()Lcom/google/android/gms/cast/games/GameManagerClient;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzjs$zzd;->zzTJ:Lcom/google/android/gms/cast/games/GameManagerClient;

    return-object v0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzjs$zzd;->zzOt:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
