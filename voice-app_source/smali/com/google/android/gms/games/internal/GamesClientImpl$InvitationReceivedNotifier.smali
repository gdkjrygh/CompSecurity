.class final Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedNotifier;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/zzi$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InvitationReceivedNotifier"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/zzi$zzb",
        "<",
        "Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzapk:Lcom/google/android/gms/games/multiplayer/Invitation;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/multiplayer/Invitation;)V
    .locals 0
    .param p1, "invitation"    # Lcom/google/android/gms/games/multiplayer/Invitation;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedNotifier;->zzapk:Lcom/google/android/gms/games/multiplayer/Invitation;

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedNotifier;->zzapk:Lcom/google/android/gms/games/multiplayer/Invitation;

    invoke-interface {p1, v0}, Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;->onInvitationReceived(Lcom/google/android/gms/games/multiplayer/Invitation;)V

    return-void
.end method

.method public zzmw()V
    .locals 0

    return-void
.end method

.method public synthetic zzn(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedNotifier;->zza(Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;)V

    return-void
.end method
