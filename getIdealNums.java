 static long getIdealNums(long low, long high) // 3 and 5 as primitive factors
    {
        
        int count = 0; // counter 

        for (long i = low; i <= high; i++) {
            long num = i;

            // While num is divisible by 3, divide it by 3
            while (num % 3 == 0)
                num /= 3;

            // While num is divisible by 5, divide it by 5
            while (num % 5 == 0)
                num /= 5;

            // If num got reduced to 1 then it has
            // only 3 and 5 as prime factors
            if (num == 1)
                count++;
        }

        return count;
    }
