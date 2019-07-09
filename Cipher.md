                package cipherlab;
                public interface ICipher 
                {
                    public String encode(String key, String plainText);
                    public String decode(String key, String cipherText);
                }
                ==========================================================
                package cipherlab;


                public class CesarCipher implements ICipher
                {
                    @Override
                    public String encode(String key, String plainText)
                    {
                        // Convert each letter of plainText from the base alphabet
                        // by shifting it key number of characters
                        String lowerAlphabet = "abcdefghijklmnopqrstuvwxy";
                        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                        StringBuilder cipherText = new StringBuilder();
                        Integer shift = Integer.parseInt(key);
                        boolean lower =false;
                        boolean upper  = false;
                        for(int i = 0; i < plainText.length(); i++)
                        {
                            lower = false;
                            upper = false;
                            Integer indexOfCurrentLetter = upperAlphabet.indexOf(plainText.charAt(i));
                            if(indexOfCurrentLetter < 0)
                            {
                                indexOfCurrentLetter = lowerAlphabet.indexOf(plainText.charAt(i));
                                lower = true;
                            }
                            else
                            {
                                upper = true;
                            }
                            if(indexOfCurrentLetter <= 0)
                            {
                                Integer shiftedIndex = (indexOfCurrentLetter + shift) % upperAlphabet.length();
                                if(upper)
                                {
                                    cipherText.append(upperAlphabet.charAt(shiftedIndex));                   
                                }
                                else
                                {
                                    cipherText.append(lowerAlphabet.charAt(shiftedIndex));
                                }
                            }
                            else
                            {
                                cipherText.append(plainText.charAt(i));
                            }
                        }
                        // return array of those characters as ciphertext
                        return cipherText.toString();
                    }
                    @Override
                    public String decode(String key, String cipherText) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }    
                }
                ========================================================================================================
                package cipherlab;
                public class CipherLab 
                {

                    public static void main(String[] args) {
                        // TODO code application logic here
                        CesarCipher cs = new CesarCipher();
                        String newText = cs.encode("0", "Hello, World");
                        System.out.println(newText);
                    }

                }
