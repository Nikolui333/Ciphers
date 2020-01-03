package com.example.ciphers;

public class KeyGenerator {

    int cMass [] = {990001, 990013, 990023, 990037, 990043, 990053, 990137, 990151, 990163, 990169, 990179, 990181, 990211, 990239, 990259, 990277, 990281, 990287,
            990289, 990293, 990307, 990313, 990323, 990329, 990331, 990349, 990359, 990361, 990371, 990377, 990383, 990389, 990397, 990463, 990469, 990487, 990497,
            990503, 990511, 990523, 990529, 990547, 990559, 990589, 990593, 990599, 990631, 990637, 990643, 990673, 990707, 990719, 990733, 990761, 990767, 990797,
            990799, 990809, 990841, 990851, 990881, 990887, 990889, 990893, 990917, 990923, 990953, 990961, 990967, 990973, 990989, 991009, 991027, 991031, 991037,
            991043, 991057, 991063, 991069, 991073, 991079, 991091, 991127, 991129, 991147, 991171, 991181, 991187, 991201, 991217, 991223, 991229, 991261, 991273,
            991313, 991327, 991343, 991357, 991381, 991387, 991409, 991427, 991429, 991447, 991453, 991483, 991493, 991499, 991511, 991531, 991541, 991547, 991567,
            991579, 991603, 991607, 991619, 991621, 991633, 991643, 991651, 991663, 991693, 991703, 991717, 991723, 991733, 991741, 991751, 991777, 991811, 991817,
            991867, 991871, 991873, 991883, 991889, 991901, 991909, 991927, 991931, 991943, 991951, 991957, 991961, 991973, 991979, 991981, 991987, 991999, 992011,
            992021, 992023, 992051, 992087, 992111, 992113, 992129, 992141, 992153, 992179, 992183, 992219, 992231, 992249, 992263, 992267, 992269, 992281, 992309,
            992317, 992357, 992359, 992363, 992371, 992393, 992417, 992429, 992437, 992441, 992449, 992461, 992513, 992521, 992539, 992549, 992561, 992591, 992603,
            992609, 992623, 992633, 992659, 992689, 992701, 992707, 992723, 992737, 992777, 992801, 992809, 992819, 992843, 992857, 992861, 992863, 992867, 992891,
            992903, 992917, 992923, 992941, 992947, 992963, 992983, 993001, 993011, 993037, 993049, 993053, 993079, 993103, 993107, 993121, 993137, 993169, 993197,
            993199, 993203, 993211};

    int mMass [] ={995009, 995023, 995051, 995053, 995081, 995117, 995119, 995147, 995167, 995173, 995219, 995227, 995237, 995243,
            995273, 995303, 995327, 995329, 995339, 995341, 995347, 995363, 995369, 995377, 995381, 995387, 995399, 995431, 995443,
            995447, 995461, 995471, 995513, 995531, 995539, 995549, 995551, 995567, 995573, 995587, 995591, 995593, 995611, 995623,
            995641, 995651, 995663, 995669, 995677, 995699, 995713, 995719, 995737, 995747, 995783, 995791, 995801, 995833, 995881,
            995887, 995903, 995909, 995927, 995941, 995957, 995959, 995983, 995987, 995989, 996001, 996011, 996019, 996049, 996067,
            996103, 996109, 996119, 996143, 996157, 996161, 996167, 996169, 996173, 996187, 996197, 996209, 996211, 996253, 996257,
            996263, 996271, 996293, 996301, 996311, 996323, 996329, 996361, 996367, 996403, 996407, 996409, 996431, 996461, 996487,
            996511, 996529, 996539, 996551, 996563, 996571, 996599, 996601, 996617, 996629, 996631, 996637, 996647, 996649, 996689, 996703};

    int m;
    int c;
    double a;

    int x [] = new int[10];

    public int appropriation(){
        int mСoefficient = (int) (Math.random()*this.mMass.length);
        int cСoefficient = (int) (Math.random()*this.cMass.length);

        this.m = mMass[mСoefficient];
        this.c = cMass[cСoefficient];
        this.a = Math.random();

        return generator(this.m,this.c,this.a);
    }

    private int generator(int m, int c, double a){
        this.x[0]= (int) (1*a+c)%m;
        for (int i = 1; i<x.length;i++){
            this.x[i]=(int) (x[i-1]*a+c)%m;
        }
        double rand = Math.random()*this.x.length;
        int randInd = (int) rand;
        int res = x[randInd];
        //String str = res+"";

        return res;

   }





}