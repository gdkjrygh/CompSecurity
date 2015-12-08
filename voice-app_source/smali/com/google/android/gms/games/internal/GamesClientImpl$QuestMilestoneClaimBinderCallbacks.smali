.class final Lcom/google/android/gms/games/internal/GamesClientImpl$QuestMilestoneClaimBinderCallbacks;
.super Lcom/google/android/gms/games/internal/AbstractGamesCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "QuestMilestoneClaimBinderCallbacks"
.end annotation


# instance fields
.field private final zzapQ:Lcom/google/android/gms/common/api/zza$zzb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/zza$zzb",
            "<",
            "Lcom/google/android/gms/games/quest/Quests$ClaimMilestoneResult;",
            ">;"
        }
    .end annotation
.end field

.field private final zzapR:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/zza$zzb;Ljava/lang/String;)V
    .locals 1
    .param p2, "milestoneId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/zza$zzb",
            "<",
            "Lcom/google/android/gms/games/quest/Quests$ClaimMilestoneResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p1, "resultHolder":Lcom/google/android/gms/common/api/zza$zzb;, "Lcom/google/android/gms/common/api/zza$zzb<Lcom/google/android/gms/games/quest/Quests$ClaimMilestoneResult;>;"
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/AbstractGamesCallbacks;-><init>()V

    const-string v0, "Holder must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/zza$zzb;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestMilestoneClaimBinderCallbacks;->zzapQ:Lcom/google/android/gms/common/api/zza$zzb;

    const-string v0, "MilestoneId must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/zzu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestMilestoneClaimBinderCallbacks;->zzapR:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public zzN(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestMilestoneClaimBinderCallbacks;->zzapQ:Lcom/google/android/gms/common/api/zza$zzb;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl;

    iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestMilestoneClaimBinderCallbacks;->zzapR:Ljava/lang/String;

    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl;-><init>(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/zza$zzb;->zzm(Ljava/lang/Object;)V

    return-void
.end method
