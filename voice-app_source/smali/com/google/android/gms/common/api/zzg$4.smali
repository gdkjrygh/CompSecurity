.class Lcom/google/android/gms/common/api/zzg$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/common/api/zzg;->zza(Lcom/google/android/gms/common/api/Api;I)Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzXE:Lcom/google/android/gms/common/api/zzg;

.field final synthetic zzXF:Lcom/google/android/gms/common/api/Api;

.field final synthetic zzXG:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/zzg;Lcom/google/android/gms/common/api/Api;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/zzg$4;->zzXE:Lcom/google/android/gms/common/api/zzg;

    iput-object p2, p0, Lcom/google/android/gms/common/api/zzg$4;->zzXF:Lcom/google/android/gms/common/api/Api;

    iput p3, p0, Lcom/google/android/gms/common/api/zzg$4;->zzXG:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3
    .param p1, "result"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/common/api/zzg$4;->zzXE:Lcom/google/android/gms/common/api/zzg;

    invoke-static {v0}, Lcom/google/android/gms/common/api/zzg;->zza(Lcom/google/android/gms/common/api/zzg;)Lcom/google/android/gms/common/api/zzh;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/zzg$4;->zzXF:Lcom/google/android/gms/common/api/Api;

    iget v2, p0, Lcom/google/android/gms/common/api/zzg$4;->zzXG:I

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/common/api/zzh;->zza(Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/api/Api;I)V

    return-void
.end method
