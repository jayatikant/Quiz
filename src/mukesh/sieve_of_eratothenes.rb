// naming 4
	//output_array / input_array /myPredefiendPrimeNumber
// object oriented design 4
// modularity 5
	//get_prime_numbers could be more modular
// error handling / validations 3
	//minimum value check
	//maximum value check
	//no check for garbage values 
// algorithm fulfillment 	3
	//finding all numbers rather than largest numbers
	//using two arrays instead of one

puts "Enter Number"
input_value = gets.chomp
@output_array = []

def find_prime_less_than_input(input_value)
  input_array = (2..input_value.to_i).to_a
  get_prime_numbers(input_array)
  puts "******** Result ********"
  puts @output_array.to_a
end

def get_prime_numbers(input_array)
	return if (input_array.empty? || input_array.nil?)
	input_array.each do |i|
  	if isPrime(i)
      @output_array << i
      refined_array = remove_multiples_of_prime(input_array, i)
      refined_array.empty? ? break : get_prime_numbers(refined_array)
  	end
  	return
  end
end

def isPrime(is_prime)
	myPredefiendPrimeNumber = [2,3,5,7,11,13,17,19,23]
	return true if myPredefiendPrimeNumber.include?(is_prime)
  (2..(is_prime/2)).each do |i|
    return false if is_prime%i==0
  end 
  return true 
end

def remove_multiples_of_prime(input_array, mul)
	refined = []
	input_array.each do |i|
		refined << i unless i%mul==0
	end
	refined
end

def validate_and_find_result(input_value)
	input_value.strip.empty?  ? (puts "Wrong Input") : find_prime_less_than_input(input_value)
end


validate_and_find_result(input_value)