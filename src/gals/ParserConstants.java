package gals;

public interface ParserConstants
{
    int FIRST_SEMANTIC_ACTION = 21;

    int SHIFT  = 0;
    int REDUCE = 1;
    int ACTION = 2;
    int ACCEPT = 3;
    int GO_TO  = 4;
    int ERROR  = 5;

    int[][][] PARSER_TABLE =
    {
        { {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  3}, {SHIFT ,  4}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO ,  1}, {GO_TO ,  2}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ACCEPT,  0}, {ERROR ,  0}, {SHIFT ,  3}, {SHIFT ,  4}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO ,  5}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  1}, {ERROR ,  0}, {REDUCE,  1}, {REDUCE,  1}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ACTION,  1}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO ,  6}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  7}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  0}, {ERROR ,  0}, {REDUCE,  0}, {REDUCE,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT ,  8}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT , 13}, {SHIFT , 14}, {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO ,  9}, {GO_TO , 10}, {GO_TO , 11}, {GO_TO , 12}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT , 13}, {SHIFT , 14}, {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 17}, {GO_TO , 10}, {GO_TO , 11}, {GO_TO , 12}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 18}, {SHIFT , 19}, {SHIFT , 20}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  6}, {ERROR ,  0}, {REDUCE,  6}, {REDUCE,  6}, {REDUCE,  6}, {SHIFT , 21}, {SHIFT , 22}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  9}, {ERROR ,  0}, {REDUCE,  9}, {REDUCE,  9}, {REDUCE,  9}, {REDUCE,  9}, {REDUCE,  9}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 11}, {ERROR ,  0}, {REDUCE, 11}, {REDUCE, 11}, {REDUCE, 11}, {REDUCE, 11}, {REDUCE, 11}, {SHIFT , 23}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ACTION,  9}, {ERROR ,  0}, {ACTION,  9}, {ACTION,  9}, {ACTION,  9}, {ACTION,  9}, {ACTION,  9}, {ACTION,  9}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 24}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ACTION, 10}, {ERROR ,  0}, {ACTION, 10}, {ACTION, 10}, {ACTION, 10}, {ACTION, 10}, {ACTION, 10}, {ACTION, 10}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 25}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT , 13}, {SHIFT , 14}, {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 26}, {GO_TO , 10}, {GO_TO , 11}, {GO_TO , 12}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 27}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 28}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 19}, {SHIFT , 20}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 29}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT , 13}, {SHIFT , 14}, {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 30}, {GO_TO , 11}, {GO_TO , 12}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT , 13}, {SHIFT , 14}, {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 31}, {GO_TO , 11}, {GO_TO , 12}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT , 13}, {SHIFT , 14}, {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 32}, {GO_TO , 12}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT , 13}, {SHIFT , 14}, {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 33}, {GO_TO , 12}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT , 13}, {SHIFT , 14}, {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 34}, {GO_TO , 12}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 12}, {ERROR ,  0}, {REDUCE, 12}, {REDUCE, 12}, {REDUCE, 12}, {REDUCE, 12}, {REDUCE, 12}, {REDUCE, 12}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 13}, {ERROR ,  0}, {REDUCE, 13}, {REDUCE, 13}, {REDUCE, 13}, {REDUCE, 13}, {REDUCE, 13}, {REDUCE, 13}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 35}, {SHIFT , 19}, {SHIFT , 20}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {SHIFT , 13}, {SHIFT , 14}, {ERROR ,  0}, {SHIFT , 16}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 36}, {GO_TO , 10}, {GO_TO , 11}, {GO_TO , 12}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ACTION,  2}, {ERROR ,  0}, {ACTION,  2}, {ACTION,  2}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 37}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ACTION,  3}, {ERROR ,  0}, {ACTION,  3}, {ACTION,  3}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 38}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ACTION,  4}, {ERROR ,  0}, {ACTION,  4}, {ACTION,  4}, {ACTION,  4}, {SHIFT , 21}, {SHIFT , 22}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 39}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ACTION,  5}, {ERROR ,  0}, {ACTION,  5}, {ACTION,  5}, {ACTION,  5}, {SHIFT , 21}, {SHIFT , 22}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 40}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ACTION,  6}, {ERROR ,  0}, {ACTION,  6}, {ACTION,  6}, {ACTION,  6}, {ACTION,  6}, {ACTION,  6}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 41}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ACTION,  7}, {ERROR ,  0}, {ACTION,  7}, {ACTION,  7}, {ACTION,  7}, {ACTION,  7}, {ACTION,  7}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 42}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ACTION,  8}, {ERROR ,  0}, {ACTION,  8}, {ACTION,  8}, {ACTION,  8}, {ACTION,  8}, {ACTION,  8}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 43}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 14}, {ERROR ,  0}, {REDUCE, 14}, {REDUCE, 14}, {REDUCE, 14}, {REDUCE, 14}, {REDUCE, 14}, {REDUCE, 14}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {SHIFT , 44}, {SHIFT , 19}, {SHIFT , 20}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  2}, {ERROR ,  0}, {REDUCE,  2}, {REDUCE,  2}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {REDUCE,  3}, {ERROR ,  0}, {REDUCE,  3}, {REDUCE,  3}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  4}, {ERROR ,  0}, {REDUCE,  4}, {REDUCE,  4}, {REDUCE,  4}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  5}, {ERROR ,  0}, {REDUCE,  5}, {REDUCE,  5}, {REDUCE,  5}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  7}, {ERROR ,  0}, {REDUCE,  7}, {REDUCE,  7}, {REDUCE,  7}, {REDUCE,  7}, {REDUCE,  7}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE,  8}, {ERROR ,  0}, {REDUCE,  8}, {REDUCE,  8}, {REDUCE,  8}, {REDUCE,  8}, {REDUCE,  8}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 10}, {ERROR ,  0}, {REDUCE, 10}, {REDUCE, 10}, {REDUCE, 10}, {REDUCE, 10}, {REDUCE, 10}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ACTION, 11}, {ERROR ,  0}, {ACTION, 11}, {ACTION, 11}, {ACTION, 11}, {ACTION, 11}, {ACTION, 11}, {ACTION, 11}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {GO_TO , 45}, {ERROR ,  0} },
        { {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {REDUCE, 15}, {ERROR ,  0}, {REDUCE, 15}, {REDUCE, 15}, {REDUCE, 15}, {REDUCE, 15}, {REDUCE, 15}, {REDUCE, 15}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0}, {ERROR ,  0} }
    };

    int[][] PRODUCTIONS =
    {
        { 15, 2 },
        { 15, 1 },
        { 16, 6 },
        { 16, 6 },
        { 17, 4 },
        { 17, 4 },
        { 17, 1 },
        { 18, 4 },
        { 18, 4 },
        { 18, 1 },
        { 19, 4 },
        { 19, 1 },
        { 20, 2 },
        { 20, 2 },
        { 20, 3 },
        { 20, 5 }
    };

    String[] PARSER_ERROR =
    {
        "Erro estado 0",
        "Erro estado 1",
        "Erro estado 2",
        "Erro estado 3",
        "Erro estado 4",
        "Erro estado 5",
        "Erro estado 6",
        "Erro estado 7",
        "Erro estado 8",
        "Erro estado 9",
        "Erro estado 10",
        "Erro estado 11",
        "Erro estado 12",
        "Erro estado 13",
        "Erro estado 14",
        "Erro estado 15",
        "Erro estado 16",
        "Erro estado 17",
        "Erro estado 18",
        "Erro estado 19",
        "Erro estado 20",
        "Erro estado 21",
        "Erro estado 22",
        "Erro estado 23",
        "Erro estado 24",
        "Erro estado 25",
        "Erro estado 26",
        "Erro estado 27",
        "Erro estado 28",
        "Erro estado 29",
        "Erro estado 30",
        "Erro estado 31",
        "Erro estado 32",
        "Erro estado 33",
        "Erro estado 34",
        "Erro estado 35",
        "Erro estado 36",
        "Erro estado 37",
        "Erro estado 38",
        "Erro estado 39",
        "Erro estado 40",
        "Erro estado 41",
        "Erro estado 42",
        "Erro estado 43",
        "Erro estado 44",
        "Erro estado 45"
    };
}
