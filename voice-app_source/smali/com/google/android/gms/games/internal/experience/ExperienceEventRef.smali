.class public final Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;
.super Lcom/google/android/gms/common/data/zzc;

# interfaces
.implements Lcom/google/android/gms/games/internal/experience/ExperienceEvent;


# instance fields
.field private final zzasN:Lcom/google/android/gms/games/GameRef;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 3
    .param p1, "holder"    # Lcom/google/android/gms/common/data/DataHolder;
    .param p2, "dataRow"    # I

    .prologue
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/zzc;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    const-string v0, "external_game_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->zzbX(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->zzasN:Lcom/google/android/gms/games/GameRef;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/games/GameRef;

    iget-object v1, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->zzWu:Lcom/google/android/gms/common/data/DataHolder;

    iget v2, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->zzYs:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/games/GameRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->zzasN:Lcom/google/android/gms/games/GameRef;

    goto :goto_0
.end method


# virtual methods
.method public getIconImageUrl()Ljava/lang/String;
    .locals 1

    const-string v0, "icon_url"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/experience/ExperienceEventRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
