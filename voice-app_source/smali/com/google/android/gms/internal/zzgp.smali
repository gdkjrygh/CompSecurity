.class public Lcom/google/android/gms/internal/zzgp;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# instance fields
.field private final zzEU:Lcom/google/android/gms/internal/zzgt;

.field private final zzxU:Lcom/google/android/gms/internal/zzeg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzeg;Lcom/google/android/gms/internal/zzgs;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzgp;->zzxU:Lcom/google/android/gms/internal/zzeg;

    new-instance v0, Lcom/google/android/gms/internal/zzgt;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/zzgt;-><init>(Lcom/google/android/gms/internal/zzgs;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzgp;->zzEU:Lcom/google/android/gms/internal/zzgt;

    return-void
.end method


# virtual methods
.method public zzfM()Lcom/google/android/gms/internal/zzeg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgp;->zzxU:Lcom/google/android/gms/internal/zzeg;

    return-object v0
.end method

.method public zzfN()Lcom/google/android/gms/internal/zzgt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgp;->zzEU:Lcom/google/android/gms/internal/zzgt;

    return-object v0
.end method
