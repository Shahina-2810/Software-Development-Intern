print("Wellcome to quiz game !!")
print('NOTE: if your spelling is incorrect then it is considered as wrong answer')
score = 0
question_no = 0
playing = input('Do you want to play ? type yes or no\n').lower()
if playing == 'yes':
    question_no += 1
    ques = input(f'\n{question_no}. Which is largest animal in the world?\nA.Shark\nB.Blue Whale\nC.Elephant\nD.Giraffe\n')
    if ques == 'Blue Whale':
        score +=1
        print('correct! you got 1 point')
        
    else:
        print('Incorrect!')
        print(f'current answer is --> Blue Whale')

# ------1
    question_no += 1
    ques = input(f'\n{question_no}. Which planet has the most moons?\nA.Mars\nB.Jupiter\nC.Saturn\nD.Earth\n')
    
    if ques == 'Saturn':
        score +=1
        print('correct! you got 1 point')
        
    else:
        print('Incorrect!')
        print(f'current answer is --> Saturn')

# -----2
    question_no += 1
    ques = input(f'\n{question_no}. How many bones do we have in an ear?\nA.1\nB.2\nC.3\nD.4\n')
    
    if ques == '3':
        score +=1
        print('correct! you got 1 point')
        
    else:
        print('Incorrect!')
        print(f'current answer is --> 3')

# -----3
    question_no += 1
    ques = input(f'\n{question_no}. Which is the biggest continent in the world?\nA.Australia\nB.Asia\nC.Africa\nD.America\n')
    
    if ques == 'Asia':
        score +=1
        print('correct! you got 1 point')
        
    else:
        print('Incorrect!')
        print(f'current answer is --> Asia')


# -----4
    question_no += 1
    ques = input(f'\n{question_no}. Which is the longest river in the world?\nA.Niger\nB.Great Ganga\nC.Amazon\nD.Nile\n')
    
    if ques == 'Nile':
        score +=1
        print('correct! you got 1 point')
        
    else:
        print('Incorrect!')
        print(f'current answer is --> Nile')


# ------5 

else:
    print('thankyou you are out of a game.')
    quit()

print(f'\nnumber of question is {question_no}')
print(f'your score is {score}')
try:
    percentage = (score *100)/question_no
except ZeroDivisionError:
    print('0% quetions are correct')

print(f'{percentage}% questions are correct.')
