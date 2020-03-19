Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  for(int i=0;i<n;i++){
      int a = scn.nextInt();
      int k = scn.nextInt();
      int count = 0;
      for(int j=0;j<a;j++){
          int f = scn.nextInt();
          if(f<=0){
              count++;
          }
          
      }
      if(count>=k){
          System.out.println("NO");
      }
      else{
          System.out.println("YES");
      }
  }