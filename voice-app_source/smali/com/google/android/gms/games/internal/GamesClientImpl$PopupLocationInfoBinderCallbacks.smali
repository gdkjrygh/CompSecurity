.class final Lcom/google/android/gms/games/internal/GamesClientImpl$PopupLocationInfoBinderCallbacks;
.super Lcom/google/android/gms/games/internal/AbstractGamesClient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "PopupLocationInfoBinderCallbacks"
.end annotation


# instance fields
.field private final zzaoU:Lcom/google/android/gms/games/internal/PopupManager;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/games/internal/PopupManager;)V
    .locals 0
    .param p1, "popupManager"    # Lcom/google/android/gms/games/internal/PopupManager;

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/AbstractGamesClient;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$PopupLocationInfoBinderCallbacks;->zzaoU:Lcom/google/android/gms/games/internal/PopupManager;

    return-void
.end method


# virtual methods
.method public zzsq()Lcom/google/android/gms/games/internal/PopupLocationInfoParcelable;
    .locals 2

    new-instance v0, Lcom/google/android/gms/games/internal/PopupLocationInfoParcelable;

    iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$PopupLocationInfoBinderCallbacks;->zzaoU:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v1}, Lcom/google/android/gms/games/internal/PopupManager;->zztg()Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/games/internal/PopupLocationInfoParcelable;-><init>(Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;)V

    return-object v0
.end method
