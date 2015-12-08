.class public final Lcom/google/android/gms/maps/model/BitmapDescriptor;
.super Ljava/lang/Object;


# instance fields
.field private final zzaBn:Lcom/google/android/gms/dynamic/zzd;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/dynamic/zzd;)V
    .locals 1
    .param p1, "remoteObject"    # Lcom/google/android/gms/dynamic/zzd;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/dynamic/zzd;

    iput-object v0, p0, Lcom/google/android/gms/maps/model/BitmapDescriptor;->zzaBn:Lcom/google/android/gms/dynamic/zzd;

    return-void
.end method


# virtual methods
.method public zzvg()Lcom/google/android/gms/dynamic/zzd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/BitmapDescriptor;->zzaBn:Lcom/google/android/gms/dynamic/zzd;

    return-object v0
.end method
